CREATE TABLE IF NOT EXISTS product (
  ID SERIAL PRIMARY KEY,
  NAME VARCHAR(45) NOT NULL UNIQUE,
  CATEGORY VARCHAR(45) NOT NULL,
  DESCRIPTION VARCHAR(45) NULL,
  PRICE DECIMAL(10,2) NULL);