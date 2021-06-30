package com.ullashmdabiribah.ordermanagementwork.web.screens.entitylogitem;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.entity.EntityLogItem;

@UiController("sec$EntityLog.edit")
@UiDescriptor("entity-log-item-edit.xml")
@EditedEntityContainer("entityLogItemDc")
@LoadDataBeforeShow
public class EntityLogItemEdit extends StandardEditor<EntityLogItem> {
}