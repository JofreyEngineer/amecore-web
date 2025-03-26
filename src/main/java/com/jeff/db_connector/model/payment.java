package com.jeff.db_connector.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "payment")
@Entity
public class payment {
    private String sender;
    private String recipient;
    private double amount;
    private String currency;
    private String status;

    public void Payment() {
        String paymentId = UUID.randomUUID().toString();
    }
}


