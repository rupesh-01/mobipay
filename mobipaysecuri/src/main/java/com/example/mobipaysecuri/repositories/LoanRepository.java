package com.example.mobipaysecuri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobipaysecuri.models.Loan;
import java.util.Optional;


public interface LoanRepository extends JpaRepository<Loan,Long>{
    Optional<Loan> findById(Long id);
}
