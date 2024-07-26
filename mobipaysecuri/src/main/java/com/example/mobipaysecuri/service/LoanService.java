package com.example.mobipaysecuri.service;

import java.util.List;

import com.example.mobipaysecuri.dtos.MockAccountdto;
import com.example.mobipaysecuri.models.Account;

public interface LoanService {
    Account getAccountById(String id);
    List<Account> getAllAccount();
    void saveAccountToDB(MockAccountdto mockAccountdto);
}
