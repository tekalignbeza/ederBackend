package com.famsoft.eder.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Proxy(lazy = false)
public class Member extends CoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String firstName;
    String lastName;
    String memberId;
    String cellPhone;
    String HomePhone;
    String email;
    @Temporal(TemporalType.DATE)
    Date regstrationDate;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Address currentAddress;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    User user;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "givenTo", cascade = CascadeType.ALL)
    List<Expense> expenses;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "paidBy", cascade = CascadeType.ALL)
    List<Payment> payments;
    String description;

    public Member() {
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Date getRegstrationDate() {
        return regstrationDate;
    }

    public void setRegstrationDate(Date regstrationDate) {
        this.regstrationDate = regstrationDate;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Member{" +
                "currentAddress=" + currentAddress +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", memberId='" + memberId + '\'' +
                ", regstrationDate=" + regstrationDate +
                ", expenses=" + expenses +
                ", payments=" + payments +
                ", description='" + description + '\'' +
                '}';
    }
}
