package com.example.mobipaysecuri.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String accNo;
    private String dueDate;
    private Long amtDue;
    private LoanDetails loanDetails;
}
