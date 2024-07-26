package com.example.mobipaysecuri.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanDetails {
    String borrowerName;
    String loanType;
    Long amount;
    double rate;
}
