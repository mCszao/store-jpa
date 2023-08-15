CREATE DATABASE store;
use store;
CREATE TABLE categories (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL
);

CREATE TABLE products (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  price DECIMAL(10, 2) NOT NULL default 0,
  categoryId INT NOT NULL,
  createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (categoryId) REFERENCES categories(id)
);


CREATE TABLE stocks (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE stock (
  product_id INT NOT NULL,
  product_stock INT NOT NULL,
  product_quantity DECIMAL (3, 2) NOT NULL default 0,
  FOREIGN KEY (product_id) REFERENCES products(id),
  FOREIGN KEY (product_stock) REFERENCES stocks(id)
);




