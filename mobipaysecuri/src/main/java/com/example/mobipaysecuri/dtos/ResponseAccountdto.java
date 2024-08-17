package com.example.mobipaysecuri.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAccountdto {
    private String loanAccountNumber;
    private String dueDate;
    private Long emiAmount;
}
