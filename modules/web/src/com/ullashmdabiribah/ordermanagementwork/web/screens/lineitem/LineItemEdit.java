package com.ullashmdabiribah.ordermanagementwork.web.screens.lineitem;

import com.haulmont.cuba.gui.screen.*;
import com.ullashmdabiribah.ordermanagementwork.entity.LineItem;

@UiController("ordermanagementwork_LineItem.edit")
@UiDescriptor("line-item-edit.xml")
@EditedEntityContainer("lineItemDc")
@LoadDataBeforeShow
public class LineItemEdit extends StandardEditor<LineItem> {
}