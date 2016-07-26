package com.famsoft.eder.data;

import com.famsoft.eder.model.Payment;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Repository
public class PaymentDaoImp extends GenericDaoImp<Payment> implements PaymentDao {

    public PaymentDaoImp() {
        super(Payment.class);
    }
}
