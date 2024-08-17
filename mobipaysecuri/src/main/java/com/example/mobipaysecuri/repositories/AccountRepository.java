package com.example.mobipaysecuri.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobipaysecuri.models.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{
    Optional<Account> findByLoanAccountNumber(String loanAccountNumber);
}
