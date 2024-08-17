package com.example.mobipaysecuri.service;

import java.util.List;

import com.example.mobipaysecuri.dtos.Accountdto;
import com.example.mobipaysecuri.dtos.ResponseAccountdto;
import com.example.mobipaysecuri.models.Account;

public class OwnLoanService implements LoanService{
    

    @Override
    public ResponseAccountdto getAccountById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public List<Account> getAllAccount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccount'");
    }

    @Override
    public Account createAccount(Accountdto mockAccountdto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }
    
}
