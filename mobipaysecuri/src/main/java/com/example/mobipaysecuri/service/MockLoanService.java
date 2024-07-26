package com.example.mobipaysecuri.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.mobipaysecuri.dao.LoanRepository;
import com.example.mobipaysecuri.dtos.MockAccountdto;
import com.example.mobipaysecuri.entities.CustomerAccount;
import com.example.mobipaysecuri.models.Account;

@Service
public class MockLoanService implements LoanService{
    private RestTemplate restTemplate;
    private LoanRepository loanRepository;
    private final Logger logger; 

    @Autowired
    public MockLoanService(RestTemplate restTemplate,LoanRepository loanRepository, Logger logger){
        this.restTemplate = restTemplate;
        this.loanRepository = loanRepository;
        this.logger = logger;
    }

    @Override
    public Account getAccountById(Long id) {
        ResponseEntity<MockAccountdto> mockAccountdto = restTemplate.getForEntity("https://demo0951179.mockable.io/loanaccount/"+id, MockAccountdto.class);
        if(mockAccountdto.getStatusCode()!=HttpStatusCode.valueOf(200)){
            logger.error("Not able to connect to the server", mockAccountdto);
        }
        logger.info("Adding the loan Account to the database");
        saveAccountToDB(mockAccountdto.getBody());
        logger.info("Successfully saved the account details to the database");
        return mockAccountdto.getBody().toAccount();
    }

    @Override
    public List<Account> getAllAccount() {
        // TODO 
        return null;
    }

    @Override
    public void saveAccountToDB(MockAccountdto mockAccountdto) {
        CustomerAccount customerAccount = mockAccountdto.convertToEntity();
        loanRepository.save(customerAccount);
    }
    
}
