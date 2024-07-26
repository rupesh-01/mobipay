package com.example.mobipaysecuri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobipaysecuri.entities.CustomerAccount;

public interface LoanRepository extends JpaRepository<CustomerAccount,Integer> {
        
}