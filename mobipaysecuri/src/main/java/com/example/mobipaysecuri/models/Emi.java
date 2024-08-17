package com.example.mobipaysecuri.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Emi extends BaseModel {
    private Long emiNumber;
    private String dueDate;
    private Long emiAmount;
    private String status;
    private String paymentDate;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Account account;
}

