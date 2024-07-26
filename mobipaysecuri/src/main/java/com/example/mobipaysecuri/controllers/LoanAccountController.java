package com.example.mobipaysecuri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobipaysecuri.models.Account;
import com.example.mobipaysecuri.service.MockLoanService;

@RestController
public class LoanAccountController {
    MockLoanService mockLoanService;

    @Autowired
    public LoanAccountController(MockLoanService mockLoanService){
        this.mockLoanService = mockLoanService;
    }
    
    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable("id") String id){
        return mockLoanService.getAccountById(id);
    }
}
