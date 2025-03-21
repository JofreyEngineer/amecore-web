package com.jeff.db_connector.dto;


public class PaymentRequest {
    private double amount;
    private String currency;
    private String paymentMethod;
    private String recipient;
    private String reference;
    private String description;

    // Constructor
    public PaymentRequest(double amount, String currency, String paymentMethod, String recipient, String reference, String description) {
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
        this.recipient = recipient;
        this.reference = reference;
        this.description = description;
    }

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", recipient='" + recipient + '\'' +
                ", reference='" + reference + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

