package com.example.mobipaysecuri.service;

import java.util.List;

import java.util.Optional;
import org.slf4j.Logger;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.mobipaysecuri.dtos.Accountdto;
import com.example.mobipaysecuri.dtos.ResponseAccountdto;
import com.example.mobipaysecuri.models.Account;
import com.example.mobipaysecuri.repositories.AccountRepository;
import com.example.mobipaysecuri.repositories.LoanRepository;

@Service
public class MockLoanService implements LoanService{
    private RestTemplate restTemplate;
    private AccountRepository accountRepository;
    private final Logger logger; 

    public MockLoanService(RestTemplate restTemplate, AccountRepository accountRepository, LoanRepository loanRepository, Logger logger){
        this.restTemplate = restTemplate;
        this.accountRepository = accountRepository;
        this.logger = logger;
    }

    @Override
    public ResponseAccountdto getAccountById(Long id) {
        ResponseEntity<Accountdto> accountDto = restTemplate.getForEntity("http://demo0951179.mockable.io/loanaccount/"+id, Accountdto.class);
        if(accountDto.getStatusCode()!=HttpStatusCode.valueOf(200)){
            logger.error("Not able to connect to the server", accountDto);
        }
        ResponseAccountdto responseAccountdto = new ResponseAccountdto();
        responseAccountdto.setLoanAccountNumber(accountDto.getBody().getLoanAccountNumber());
        responseAccountdto.setDueDate(accountDto.getBody().getEmiDetails().get(0).getDueDate());
        responseAccountdto.setEmiAmount(accountDto.getBody().getEmiDetails().get(0).getEmiAmount());
        Optional<Account> accountFromDb = accountRepository.findByLoanAccountNumber(accountDto.getBody().getLoanAccountNumber());
        if(accountFromDb.isEmpty()){
            accountRepository.save(accountDto.getBody().toAccount());
        }
        return responseAccountdto;
    }

    @Override
    public List<Account> getAllAccount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccount'");
    }

    @Override
    public Account createAccount(Accountdto accountdto) {
        return null;
    }

}
