# Write your MySQL query statement below
Select ep.unique_id , e.name from Employees e Left Join EmployeeUNI ep ON e.id = ep.id 