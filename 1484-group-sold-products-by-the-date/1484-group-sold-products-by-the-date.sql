# Write your MySQL query statement below

Select sell_date, count(Distinct product) as num_sold ,
Group_CONCAT(Distinct product order by product ASC separator ',') as products
from Activities  
Group By sell_date
order by sell_date ASC