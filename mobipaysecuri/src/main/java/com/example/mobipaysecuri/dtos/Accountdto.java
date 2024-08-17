package com.example.mobipaysecuri.dtos;

import java.util.ArrayList;
import java.util.List;

import com.example.mobipaysecuri.models.Account;
import com.example.mobipaysecuri.models.Emi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Accountdto {
    private String loanAccountNumber;
    private LoanDetailsdto loanDetails;
    private List<Emidto> emiDetails;
    private Long totalDue;
    private String nextDueDate;

    public Account toAccount(){
        Account account = new Account();
        account.setLoanAccountNumber(loanAccountNumber);
        List<Emi> emis = new ArrayList<>();
        for(Emidto emidto: emiDetails){
            emis.add(emidto.toEmi());
        }
        account.setEmiDetails(emis);
        account.setLoanDetails(loanDetails.toLoan());
        account.setTotalDue(totalDue);
        account.setNextDueDate(nextDueDate);
        return account;
    }
}
