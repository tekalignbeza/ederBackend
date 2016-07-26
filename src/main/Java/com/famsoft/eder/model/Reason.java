package com.famsoft.eder.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Proxy(lazy = false)
public class Reason {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    String reason;
    String description;
    ReasonFor reasonFor;
    public static enum ReasonFor{PAYMENT,EXPENSE};

    public Reason() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ReasonFor getReasonFor() {
        return reasonFor;
    }

    public void setReasonFor(ReasonFor reasonFor) {
        this.reasonFor = reasonFor;
    }
}


