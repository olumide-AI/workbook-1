-- 1. Get all dealerships
SELECT * FROM CarDealershipDB.dealerships;

-- 2. Find all vehicles for a specific dealership
SELECT * FROM CarDealershipDB.vehicles
JOIN inventory
ON vehicles.vin = inventory.vin
WHERE dealership_id = 1;

-- 3. Find a car by VIN
SELECT make, model FROM CarDealershipDB.vehicles
WHERE vin = '1FAFP4041WF192837' ;

-- 4. Find the dealership where a certain car is located, by VIN
SELECT * FROM CarDealershipDB.vehicles
JOIN inventory
ON vehicles.vin = inventory.vin
JOIN dealerships
ON inventory.dealership_id = dealerships.dealership_id
WHERE inventory.vin = '1FAFP4041WF192837';

-- 5. Find all Dealerships that have a certain car type (i.e. Red Ford Mustang)
SELECT dealership_name FROM CarDealershipDB.inventory
JOIN vehicles
ON inventory.vin = vehicles.vin
JOIN dealerships
ON inventory.dealership_id = dealerships.dealership_id
WHERE vehicles.make = 'Ford' AND vehicles.color = 'Red' AND vehicles.model = 'Mustang';

-- 6. Get all sales information for a specific dealer for a specific date range
SELECT * FROM CarDealershipDB.sales_contract
WHERE dealership_id = 1
AND sale_date BETWEEN '2025-01-01' AND '2025-12-31'
ORDER BY sale_date;
