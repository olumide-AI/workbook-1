-- 1. Add a new supplier.
INSERT INTO suppliers VALUES
("Olumide Company", "Olu", "CEO", "123 Street", "LA", "West Coast", 12389, "USA", "789-456-3214", "789-456-3214", NULL);

-- 2. Add a new product provided by that supplier
INSERT INTO products VALUES
(456,"Crab Legs", 30, 8, 25, 15.25, 500, 10, 12, 0);

-- 4. Raise the price of your new product by 15%.
UPDATE products SET UnitPrice = 15.25 + (15.25*0.15)
WHERE products.ProductID = 456;

-- 6. Delete the new product.
DELETE FROM products
WHERE ProductID = 456;

-- 7. Delete the new supplier.
DELETE FROM suppliers
WHERE SupplierID = 30;