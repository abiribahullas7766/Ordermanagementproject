package com.ullashmdabiribah.ordermanagementwork.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.ullashmdabiribah.ordermanagementwork.entity.Customer;

@UiController("ordermanagementwork_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}