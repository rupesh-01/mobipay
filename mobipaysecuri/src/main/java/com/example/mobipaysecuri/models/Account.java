package com.example.mobipaysecuri.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Account extends BaseModel {
    private String loanAccountNumber;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Loan loanDetails;
    @OneToMany(mappedBy = "account")
    private List<Emi> emiDetails;
    private Long totalDue;
    private String nextDueDate;
}
