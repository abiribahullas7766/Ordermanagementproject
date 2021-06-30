package com.ullashmdabiribah.ordermanagementwork.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "ORDERMANAGEMENTWORK_CUSTOMER")
@Entity(name = "ordermanagementwork_Customer")
@NamePattern("%s|name")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -9178878838122451150L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "BIRTHDAY", nullable = false)
    private Date birthday;

    @OneToMany(mappedBy = "customer")
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}