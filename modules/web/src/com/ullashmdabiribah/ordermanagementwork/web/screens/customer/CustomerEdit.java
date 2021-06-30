package com.ullashmdabiribah.ordermanagementwork.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.ullashmdabiribah.ordermanagementwork.entity.Customer;

@UiController("ordermanagementwork_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}