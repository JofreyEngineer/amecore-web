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

    public PaymentRequest() {
        this.paymentId = UUID.randomUUID().toString();
    }

    public PaymentRequest(String sender, String recipient, double amount, String currency) {
        this();
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.currency = currency;
        this.status = "Pending";
    }

    public void processPayment() {
        this.status = "Completed";
    }

    // Getters and Setters
    public String getPaymentId() { return paymentId; }
    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }
    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
