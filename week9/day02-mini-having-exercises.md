# SQL Having Exercises 

- Which products have been ordered more than 200 times in total?
    - SELECT sum(Quantity) AS TotalQuantity, ProductID FROM northwind.`Order Details`
      group by ProductID
      HAVING SUM(Quantity) >= 200;
- Which customers have placed more than 10 orders?
    - SELECT count(OrderID), CustomerID FROM northwind.Orders
      GROUP BY CustomerID
      HAVING count(OrderID) >= 10;
- List suppliers who supply more than 5 products.
    - SELECT COUNT(ProductID) AS ProductCount, SupplierID FROM northwind.Products
      GROUP BY SupplierID
      HAVING COUNT(ProductID) > 1;
- Find categories that contain at least one product with an average unit price above 40.
    - SELECT AVG(UnitPrice), CategoryID FROM northwind.Products
      GROUP BY CategoryID
      HAVING AVG(UnitPrice);
- List order IDs where the total quantity ordered exceeds 100.
    - SELECT SUM(Quantity) AS TotalQuantity, OrderID FROM northwind.`Order Details`
      GROUP BY OrderID
      HAVING SUM(Quantity) > 100;
- Which products have an average ordered quantity between 20 and 40?
    - SELECT avg(Quantity), OrderID FROM northwind.`Order Details`
      GROUP BY OrderID
      HAVING avg(Quantity) BETWEEN 20 AND 40;