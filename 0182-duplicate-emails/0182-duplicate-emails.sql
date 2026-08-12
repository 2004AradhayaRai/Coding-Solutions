# Write your MySQL query statement below
Select email as Email from Person Group By email Having COUNT(email) > 1;