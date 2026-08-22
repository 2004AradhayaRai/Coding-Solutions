# Write your MySQL query statement below
Select e.name , b.bonus 
from Employee e Left Join Bonus b 
ON e.empID = b.empId WHERE (b.bonus < 1000 OR b.bonus IS NULL) 