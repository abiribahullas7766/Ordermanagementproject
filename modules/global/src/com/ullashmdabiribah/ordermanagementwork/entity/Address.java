package com.ullashmdabiribah.ordermanagementwork.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "ORDERMANAGEMENTWORK_ADDRESS")
@Entity(name = "ordermanagementwork_Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = 3261674544008547405L;

    @NotNull
    @Column(name = "STREET", nullable = false)
    private String street;

    @NotNull
    @Column(name = "POSTCODE", nullable = false)
    private String postcode;

    @NotNull
    @Column(name = "CITY", nullable = false)
    private String city;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}