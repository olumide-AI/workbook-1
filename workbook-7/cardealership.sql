-- Create Database/Schema
CREATE DATABASE IF NOT EXISTS CarDealershipDB;

-- Create Tables
-- Table 1:
Create TABLE dealerships (
dealership_id INT AUTO_INCREMENT ,
dealership_name VARCHAR(50) NOT NULL,
customer_address VARCHAR(50) NOT NULL,
phone_number VARCHAR(12),
PRIMARY KEY (dealership_id)
);

-- Table 2:
CREATE TABLE vehicles (
vin VARCHAR(17) NOT NULL,
sold BOOLEAN NOT NULL DEFAULT FALSE,
vehicle_year INT NOT NULL,
odometer INT NOT NULL,
vehicle_price DECIMAL(10,2) NOT NULL,
make VARCHAR(20) NOT NULL,
model VARCHAR(20) NOT NULL,
PRIMARY KEY (VIN)
);

-- Table 3:
CREATE TABLE inventory (
dealership_id INT NOT NULL,
vin VARCHAR(17) NOT NULL,
PRIMARY KEY (dealership_id, vin),
FOREIGN KEY(dealership_id) REFERENCES dealerships(dealership_id)
ON DELETE CASCADE
ON UPDATE CASCADE,
FOREIGN KEY(vin) REFERENCES vehicles(vin)
ON DELETE CASCADE
ON UPDATE CASCADE
);

-- Table 4:
CREATE TABLE sales_contract (
sales_id INT AUTO_INCREMENT,
dealership_id INT NOT NULL,
vin VARCHAR(17) NOT NULL,
sale_date DATE NOT NULL,
sale_price DECIMAL(10,2) NOT NULL,
PRIMARY KEY (sales_id),
FOREIGN KEY(vin) REFERENCES vehicles(vin)
ON DELETE RESTRICT,
FOREIGN KEY(dealership_id) REFERENCES dealerships(dealership_id)
ON DELETE RESTRICT
);

-- Table 5:
CREATE TABLE lease_contract (
lease_id INT AUTO_INCREMENT,
vin VARCHAR(17) NOT NULL,
start_lease DATE NOT NULL,
end_lease DATE NOT NULL,
monthly_payment DECIMAL(10,2) NOT NULL,
PRIMARY KEY (lease_id),
FOREIGN KEY(vin) REFERENCES vehicles(vin)
ON DELETE RESTRICT
);

-- Populate us with sample data:
-- Dealership Data
INSERT INTO dealerships (dealership_name, customer_address, phone_number) VALUES
('OluAuto', '1234 cali drive', '234-345-0982'),
('Wilmar magical cars', '234 HarryPorter lane', '111-222-3333'),
('Maiike mom cars', '123, netherland drive', '345-567-3934');

-- Vehicle Data
INSERT INTO vehicles (vin, sold, vehicle_year, odometer, vehicle_price, make, model) VALUES
('1HGCM82633A004352', FALSE, 2021, 12000, 18500.00, 'Honda',   'Accord',   'Blue'),
('1FAFP4041WF192837', FALSE, 2022,  8000, 24300.00, 'Ford',    'Mustang',  'Red'),
('2T1BURHE6FC123456', FALSE, 2020, 20000, 15999.95, 'Toyota',  'Corolla',  'White'),
('3GNEK18R5XG123789', FALSE,   2019, 35000, 13950.00, 'Chevrolet','Tahoe',   'Black'),
('5NPE24AF2FH123654', FALSE, 2023,  5000, 21950.00, 'Hyundai', 'Sonata',   'Gray');

-- Inventory Data
INSERT INTO inventory (dealership_id, vin) VALUES
  (1, '1HGCM82633A004352'),
  (1, '1FAFP4041WF192837'),
  (2, '2T1BURHE6FC123456'),
  (2, '3GNEK18R5XG123789'),
  (3, '5NPE24AF2FH123654');


