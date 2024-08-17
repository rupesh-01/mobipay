package com.example.mobipaysecuri.dtos;

import com.example.mobipaysecuri.models.Emi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emidto {
    private Long emiNumber;
    private String dueDate;
    private Long emiAmount;
    private String status;
    private String paymentDate;

    public Emi toEmi(){
        Emi emi = new Emi();
        emi.setEmiNumber(emiNumber);
        emi.setDueDate(dueDate);
        emi.setEmiAmount(emiAmount);
        emi.setStatus(status);
        emi.setPaymentDate(paymentDate);
        return emi;
    }
}
