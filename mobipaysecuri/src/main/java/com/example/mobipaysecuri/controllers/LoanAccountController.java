package com.example.mobipaysecuri.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobipaysecuri.dtos.ResponseAccountdto;
import com.example.mobipaysecuri.service.MockLoanService;

@RestController
public class LoanAccountController {
    MockLoanService mockLoanService;

    public LoanAccountController(MockLoanService mockLoanService){
        this.mockLoanService = mockLoanService;
    }
    
    @GetMapping("/accounts/{id}")
    public ResponseAccountdto getAccountById(@PathVariable("id") Long id){
        return mockLoanService.getAccountById(id);
    }
}
