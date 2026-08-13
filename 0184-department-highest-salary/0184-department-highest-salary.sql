# Write your MySQL query statement below
Select d.name AS Department, e.name AS Employee , e.salary AS Salary from Employee e Left Join Department d
On e.departmentId=d.id 
where e.salary=(Select Max(salary) from Employee Where departmentId=e.departmentId)