package com.example.mobipaysecuri.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CustomerAccount {
    @Id
    Long accountId;
    String dueDate;
    Long emiAmount;
}
