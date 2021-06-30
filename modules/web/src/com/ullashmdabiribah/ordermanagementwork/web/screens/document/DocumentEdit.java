package com.ullashmdabiribah.ordermanagementwork.web.screens.document;

import com.haulmont.cuba.gui.screen.*;
import com.ullashmdabiribah.ordermanagementwork.entity.Document;

@UiController("ordermanagementwork_Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
@LoadDataBeforeShow
public class DocumentEdit extends StandardEditor<Document> {
}