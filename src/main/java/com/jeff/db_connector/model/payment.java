package com.jeff.db_connector.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Table(name = "payment")
@Entity
public class payment {
    @Id
    private String paymentId;
    private String sender;
    private String recipient;
    private double amount;
    private String currency;
    private String status;

    public void Payment() {
        this.paymentId = UUID.randomUUID().toString();
    }
}


