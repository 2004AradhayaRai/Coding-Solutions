# Write your MySQL query statement below
Select c.name as Customers from Customers c Left Join Orders o ON o.customerId=c.id Where o.customerId is Null