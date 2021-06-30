package com.ullashmdabiribah.ordermanagementwork.web.screens.document;

import com.haulmont.cuba.gui.screen.*;
import com.ullashmdabiribah.ordermanagementwork.entity.Document;

@UiController("ordermanagementwork_Document.browse")
@UiDescriptor("document-browse.xml")
@LookupComponent("documentsTable")
@LoadDataBeforeShow
public class DocumentBrowse extends StandardLookup<Document> {
}