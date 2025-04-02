package com.jeff.db_connector.repository;

import com.jeff.db_connector.model.Payment; // Ensure this import exists
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Your repository methods here
}
