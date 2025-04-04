package com.jeff.db_connector.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Table(name = "payment")
@Entity
public class PaymentRequest {

    @Id
    private String paymentId;
    private String sender;
    private String recipient;
    private double amount;
    private String currency;
    private String status;


}
