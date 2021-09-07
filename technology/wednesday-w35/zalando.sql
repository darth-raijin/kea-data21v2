CREATE DATABASE Zalando;
USE Zalando;

CREATE TABLE clothes (
	sku VARCHAR(255) primary key UNIQUE NOT NULL,
    brand VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL,
    price DECIMAL(15,2) NOT NULL,
    color VARCHAR(100) NOT NULL,
    sale_percentage INT
);

INSERT INTO clothes (sku, brand, model, price, color)
VALUES ("joc12n001-q27", "Jordan", "AIR JORDAN 1 MID", 795.95, "Crimson Tint"); 

INSERT INTO clothes (sku, brand, model, price, color, sale_percentage)
VALUES ("ad1210016-q11", "Adidas", "Stripes Tee", 229.00, "Crimson Tint", 25); 

INSERT INTO clothes (sku, brand, model, price, color, sale_percentage)
VALUES ("ad230016-q11", "Nike", "Macwis", 125.45, "Dripp", 3); 

SELECT * FROM clothes;