alter table ORDERMANAGEMENTWORK_DOCUMENT add constraint FK_ORDERMANAGEMENTWORK_DOCUMENT_ON_FILE foreign key (FILE_ID) references SYS_FILE(ID);
alter table ORDERMANAGEMENTWORK_DOCUMENT add constraint FK_ORDERMANAGEMENTWORK_DOCUMENT_ON_ORDER foreign key (ORDER_ID) references ORDERMANAGEMENTWORK_ORDER(ID);
create index IDX_ORDERMANAGEMENTWORK_DOCUMENT_ON_FILE on ORDERMANAGEMENTWORK_DOCUMENT (FILE_ID);
create index IDX_ORDERMANAGEMENTWORK_DOCUMENT_ON_ORDER on ORDERMANAGEMENTWORK_DOCUMENT (ORDER_ID);
