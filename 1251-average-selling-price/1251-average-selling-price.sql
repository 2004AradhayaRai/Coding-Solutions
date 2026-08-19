# Write your MySQL query statement below
Select p.product_id ,
ROUND(IFNULL(SUM(p.price * u.units)/SUM(u.units),0),2) AS average_price
from Prices p Left Join UnitsSold u 
On p.product_id = u.product_id 
and u.purchase_date between p.start_date and p.end_date
Group by p.product_id