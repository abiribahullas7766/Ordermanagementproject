package com.ullashmdabiribah.ordermanagementwork.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "ORDERMANAGEMENTWORK_PRODUCT")
@Entity(name = "ordermanagementwork_Product")
@NamePattern("%s|name")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 2168348957689936406L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CODE")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}