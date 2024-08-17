package com.example.mobipaysecuri.service;

import java.util.List;

import com.example.mobipaysecuri.dtos.Accountdto;
import com.example.mobipaysecuri.dtos.ResponseAccountdto;
import com.example.mobipaysecuri.models.Account;

public interface LoanService {
    ResponseAccountdto getAccountById(Long id);
    List<Account> getAllAccount();
    Account createAccount(Accountdto mockAccountdto);
}
