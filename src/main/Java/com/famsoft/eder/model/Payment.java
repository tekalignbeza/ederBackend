package com.famsoft.eder.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Proxy(lazy = false)
public class Payment extends CoreEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    @Temporal(TemporalType.DATE)
    Date paymentDate;
    double amount;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    Reason paymentReason;
    String confirmationNumber;
    String description;
    @ManyToOne(fetch = FetchType.EAGER)
    Member paidBy;

    public Payment() {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Reason getPaymentReason() {
        return paymentReason;
    }

    public void setPaymentReason(Reason paymentReason) {
        this.paymentReason = paymentReason;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", id=" + id +
                ", paymentDate=" + paymentDate +
                ", paymentReason=" + paymentReason +
                ", confirmationNumber='" + confirmationNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
