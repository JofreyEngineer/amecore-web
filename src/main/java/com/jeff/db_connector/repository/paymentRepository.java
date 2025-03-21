package com.jeff.db_connector.repository;

import com.jeff.db_connector.dto.PaymentRequest;
import com.jeff.db_connector.model.Customer;
import com.jeff.db_connector.model.payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface paymentRepository extends JpaRepository<payment, String> {
    List<PaymentRequest> findAllByStatus(String status);

}
