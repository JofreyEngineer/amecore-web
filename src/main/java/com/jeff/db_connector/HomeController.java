package com.jeff.db_connector;

import com.jeff.db_connector.dto.CustomerRequest;
import com.jeff.db_connector.model.Customer;
import com.jeff.db_connector.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("Welcome to Our Platform");
    }

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/customers")
    public ResponseEntity<?> getCustomers() {
        return ResponseEntity.ok(customerRepository.findAll());
    }

    @GetMapping("/customers/active")
    public ResponseEntity<?> getActiveCustomers() {
        return ResponseEntity.ok(customerRepository.findAllByStatus("A"));
    }

    @GetMapping("/customers/create")
    public ResponseEntity<?> createCustomer(@RequestBody CustomerRequest request) {
        Customer newCustomer = new Customer();
        newCustomer.setFirstname(request.getFirstname());
        newCustomer.setMiddlename(request.getMiddlename());
        newCustomer.setAccountNo(request.getAccountNo());
        newCustomer.setStatus("A");

        Customer savedCustomer = customerRepository.save(newCustomer);
        return ResponseEntity.ok(savedCustomer);
    }
}
