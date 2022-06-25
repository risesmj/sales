CREATE TABLE customer(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100)
);

CREATE TABLE product(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(100)
);

CREATE TABLE sales_order(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    customer_id INTEGER REFERENCES customer(id),
    emission TIMESTAMP,
    total NUMERIC(20,2)
);

CREATE TABLE item_order(
   id INTEGER PRIMARY KEY AUTO_INCREMENT,
   sales_order_id INTEGER REFERENCES sales_order(id),
   product_id INTEGER REFERENCES product(id),
   quantity INTEGER,
   price NUMERIC(20,2)
);