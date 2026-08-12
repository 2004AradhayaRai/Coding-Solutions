# Write your MySQL query statement below
Select e2.name as Employee from Employee e1 INNER Join Employee e2 ON e1.id = e2.managerId where e1.salary<e2.salary