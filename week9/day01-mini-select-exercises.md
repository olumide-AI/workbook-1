# Exercise 

## Mini SELECT Exercises

#### Each one should result in a single query using what they know.

- Find all products that have more than 100 units in stock.
  - SELECT *
    FROM Products
    WHERE UnitsInStock > 100;

- Get the first 5 customers whose company name starts with the letter "S".
  - SELECT * FROM northwind.Customers
    WHERE CompanyName LIKE "s%"
    LIMIT 5;
  
- Show all orders that contain product ID 42.
  - SELECT * FROM northwind.Products
    WHERE ProductID = 42;
  
- Which products have exactly 0 units on order?
- List 10 products with a UnitPrice between 15 and 30.
- Find all customers whose company name ends in "Inc.".
- Show all products that have less than 10 units in stock and more than 0 units on order.
- List all customers with a CustomerID that contains the letter "A".
- Find the first 3 entries in the Order Details table where quantity is greater than 50.
- Show the details of the product with ProductName equal to "Chai".
