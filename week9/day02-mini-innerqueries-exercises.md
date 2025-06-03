# Inner Queries Exercises 

## Level 1: Single-Level Inner Queries

- Find the product names of products that have the highest unit price.
    - SELECT ProductName FROM northwind.Products
      WHERE UnitPrice = (SELECT max(UnitPrice) FROM northwind.Products);
- Find all customers who placed the most recent order.
    - SELECT * FROM northwind.Customers
      where CustomerID IN (SELECT CustomerID FROM northwind.Orders
      WHERE OrderDate = (SELECT MAX(OrderDate) FROM northwind.Orders));
- List all products that have never been ordered.
    - SELECT ProductID FROM northwind.Products
      WHERE ProductID NOT IN (SELECT DISTINCT ProductId FROM northwind.`Order Details`);
- Find the name of the supplier who supplies the most expensive product.
    - SELECT * FROM northwind.Suppliers
      WHERE SupplierID IN (SELECT SupplierID FROM northwind.Products
      WHERE UnitPrice = (SELECT max(UnitPrice) FROM northwind.Products));
- List all orders where the quantity ordered was more than the average quantity of all orders.
    - SELECT OrderID, CustomerID FROM northwind.Orders
      WHERE OrderID IN (SELECT OrderID FROM northwind.`Order Details`
      WHERE Quantity > (SELECT AVG(Quantity) FROM northwind.`Order Details`));

## Level 2: Two Nested Queries

- Find the product names of all products that were ordered in the order with the highest total quantity.
    - SELECT ProductName FROM northwind.Products
      WHERE ProductID IN (
      SELECT ProductID from `Order Details`
      WHERE OrderID = (
      SELECT OrderID FROM northwind.`Order Details`
      GROUP BY OrderID
      ORDER BY SUM(Quantity) DESC
      LIMIT 1
      )
      );
- List all customers who have only placed one order.
💡 Hint
- Find the average unit price of products ordered by customers from London.
💡 Hint
- Find names of customers who have ordered a product with less than 10 units in stock.
💡 Hint
- Find categories where at least one product was ordered in quantity over 50.
