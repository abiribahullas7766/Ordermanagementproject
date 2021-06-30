package com.ullashmdabiribah.ordermanagementwork.web.screens.address;

import com.haulmont.cuba.gui.screen.*;
import com.ullashmdabiribah.ordermanagementwork.entity.Address;

@UiController("ordermanagementwork_Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
@LoadDataBeforeShow
public class AddressEdit extends StandardEditor<Address> {
}