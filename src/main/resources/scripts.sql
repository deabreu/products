create extension hstore;

create table if not exists exercise.products (
    product_id BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR NOT NULL,
    category VARCHAR NOT NULL,
    weight NUMERIC(12,7),
    price NUMERIC(12,7),
    creation_date TIMESTAMP WITH TIME ZONE NOT NULL
    );

create table if not exists exercise.items (
    item_id BIGSERIAL NOT NULL PRIMARY KEY,
    product_id BIGINT NOT NULL,
    cost NUMERIC(12,7),
    shipping_fee NUMERIC(12,7),
    tax_amount NUMERIC(12,7),
    creation_date TIMESTAMP WITH TIME ZONE NOT NULL
    );

create table if not exists exercise.order (
    order_id BIGSERIAL NOT NULL PRIMARY KEY,
    customer_name VARCHAR NOT NULL,
    contact VARCHAR NOT NULL,
    shipping_address VARCHAR NOT NULL,
    total NUMERIC(12,7),
    creation_date TIMESTAMP WITH TIME ZONE NOT NULL
    );

