package com.ullashmdabiribah.ordermanagementwork.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.ullashmdabiribah.ordermanagementwork.entity.Order;

@UiController("ordermanagementwork_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}