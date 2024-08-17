package com.example.mobipaysecuri.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Loan extends BaseModel{
    private String borrowerName;
    private String loanType;
    private Long loanAmount;
    private double interestRate;
    private String loanStartDate;
    private String loanEndDate;
    @OneToOne(mappedBy = "loanDetails")
    private Account account;
}
