package com.onlinestore.payment.controller;

import com.onlinestore.payment.model.Payment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{paymentId}")
    public Payment getPayment(@PathVariable String paymentId) {
        // Implement logic to retrieve payment details by paymentId
        Payment payment = new Payment(paymentId, 100.0); // Example data
        return payment;
    }

    @PostMapping
    public Payment makePayment(@RequestBody Payment payment) {
        // Implement logic to process the payment
        // You can use the payment object to access payment details
        // Example: perform payment processing
        // ...

        // Return the processed payment
        return payment;
    }
}
