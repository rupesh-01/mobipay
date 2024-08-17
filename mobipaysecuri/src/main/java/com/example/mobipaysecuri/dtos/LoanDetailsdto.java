package com.example.mobipaysecuri.dtos;

import com.example.mobipaysecuri.models.Loan;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanDetailsdto {
    private String borrowerName;
    private String loanType;
    private Long loanAmount;
    private double interestRate;
    private String loanStartDate;
    private String loanEndDate;

    public Loan toLoan(){
        Loan loan = new Loan();
        loan.setBorrowerName(borrowerName);
        loan.setLoanType(loanType);
        loan.setLoanAmount(loanAmount);
        loan.setInterestRate(interestRate);
        loan.setLoanStartDate(loanStartDate);
        loan.setLoanEndDate(loanEndDate);
        return loan;
    }
}
