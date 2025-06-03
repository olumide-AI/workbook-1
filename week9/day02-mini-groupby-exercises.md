# Mini SQL Exercises (with Aggregates & GROUP BY)

- How many orders has each customer placed?
    -SELECT COUNT(*), CustomerID FROM northwind.Orders
    -GROUP BY CustomerID;
- What is the total quantity ordered for each product?
    -SELECT SUM(Quantity), ProductID  FROM northwind.`Order Details`
    -GROUP BY ProductID;
- Find the average unit price of all products.
    -SELECT AVG(UnitPrice), ProductName FROM northwind.Products
    -GROUP BY ProductName;
- Which product has the highest unit price?
    -SELECT MAX(UnitPrice), ProductName FROM northwind.Products
    -GROUP BY ProductName;
- Which customer placed the most recent order?
    -SELECT MAX(OrderDate), CustomerID FROM northwind.Orders
    -GROUP BY CustomerID;
- Get the total number of products in each category.
    -SELECT COUNT(*), CategoryID FROM northwind.Products
    -GROUP BY CategoryID;
- What is the total number of products ordered (sum of Quantity) per OrderID?
    -SELECT SUM(Quantity), OrderID FROM northwind.`Order Details`
    -GROUP BY(OrderID);
- What is the minimum and maximum unit price of products from each supplier?
    -SELECT MIN(UnitPrice) AS MinPrice, MAX(UnitPrice)  AS MaxPrice, SupplierID FROM northwind.Products
    -GROUP BY SupplierID;
- For each customer, how many different orders did they place and what is the average number of days between their orders? (Bonus exploratory, but just do the count for now.)
    - SELECT COUNT(OrderID) AS UniqueOrderID, CustomerID FROM northwind.Orders
      GROUP BY CustomerID;
What is the average quantity per product (not per order)?
    - SELECT AVG(Quantity) AS AvgQuantity, ProductID FROM northwind.`Order Details`
      GROUP BY ProductID;
