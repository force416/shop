--liquibase formatted sql
--changeset version:v1

create table if not exists customers (
    id INTEGER NOT NULL primary key,
    username varchar(255),
    password varchar (255),
    create_time TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);
--rollback drop table chats;
