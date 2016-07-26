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
public class Expense extends CoreEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    @Temporal(TemporalType.DATE)
    Date expenseDate;
    double amount;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    Reason expenseReason;
    String confirmationNumber;
    String descritpion;
    @ManyToOne(fetch = FetchType.EAGER)
    Member givenTo;

    public Expense() {
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

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public Reason getExpenseReason() {
        return expenseReason;
    }

    public void setExpenseReason(Reason expenseReason) {
        this.expenseReason = expenseReason;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
