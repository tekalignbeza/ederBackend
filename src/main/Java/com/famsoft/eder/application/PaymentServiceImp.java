package com.famsoft.eder.application;

import com.famsoft.eder.data.GenericDao;
import com.famsoft.eder.data.GenericDaoImp;
import com.famsoft.eder.data.PaymentDao;
import com.famsoft.eder.model.Expense;
import com.famsoft.eder.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Service
@Transactional
public class PaymentServiceImp extends GenericServiceImp<Payment> implements PaymentService {

    @Autowired
    public PaymentServiceImp(PaymentDao paymentDao) {
        super(paymentDao);
    }
}
