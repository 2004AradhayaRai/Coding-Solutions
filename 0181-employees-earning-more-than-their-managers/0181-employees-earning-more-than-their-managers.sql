# Write your MySQL query statement below
Select e2.name as Employee from Employee e2 Inner Join Employee e1 On e1.id=e2.managerId where e2.salary>e1.salary