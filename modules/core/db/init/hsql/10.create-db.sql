-- begin ORDERMANAGEMENTWORK_CUSTOMER
create table ORDERMANAGEMENTWORK_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    FIRST_NAME varchar(255),
    BIRTHDAY date not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENTWORK_CUSTOMER
-- begin ORDERMANAGEMENTWORK_ADDRESS
create table ORDERMANAGEMENTWORK_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STREET varchar(255) not null,
    POSTCODE varchar(255) not null,
    CITY varchar(255) not null,
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENTWORK_ADDRESS
-- begin ORDERMANAGEMENTWORK_ORDER
create table ORDERMANAGEMENTWORK_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36),
    ORDER_ID varchar(255),
    ORDER_DATE date not null,
    DELIVERY_DATE date not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENTWORK_ORDER
-- begin ORDERMANAGEMENTWORK_LINE_ITEM
create table ORDERMANAGEMENTWORK_LINE_ITEM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36) not null,
    PRICE decimal(19, 2) not null,
    QUANTITY integer not null,
    ORDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENTWORK_LINE_ITEM
-- begin ORDERMANAGEMENTWORK_PRODUCT
create table ORDERMANAGEMENTWORK_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENTWORK_PRODUCT
-- begin ORDERMANAGEMENTWORK_DOCUMENT
create table ORDERMANAGEMENTWORK_DOCUMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FILE_ID varchar(36) not null,
    TYPE_ varchar(50),
    ORDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENTWORK_DOCUMENT
