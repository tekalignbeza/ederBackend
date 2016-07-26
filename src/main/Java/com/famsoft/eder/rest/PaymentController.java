package com.famsoft.eder.rest;

import com.famsoft.eder.application.GenericService;
import com.famsoft.eder.application.PaymentService;
import com.famsoft.eder.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tekalign.bezawork on 4/22/16.
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController extends GenericController<Payment> {

    @Autowired
    public PaymentController(PaymentService paymentService) {
        super(paymentService);
    }
}
