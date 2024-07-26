package com.example.mobipaysecuri.dtos;

import com.example.mobipaysecuri.entities.CustomerAccount;
import com.example.mobipaysecuri.models.Account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MockAccountdto {
    private Long loanAccountNumber;
    private String dueDate;
    private Long totalDue;

    public Account toAccount(){
        Account account = new Account();
        account.setAccNo(loanAccountNumber);
        account.setDueDate(dueDate);
        account.setAmtDue(totalDue);
        return account;
    }
    public CustomerAccount convertToEntity(){
        CustomerAccount customerAccount = new CustomerAccount();
        customerAccount.setAccountId(loanAccountNumber);
        customerAccount.setDueDate(dueDate);
        customerAccount.setEmiAmount(totalDue);
        return customerAccount;
    }
}
