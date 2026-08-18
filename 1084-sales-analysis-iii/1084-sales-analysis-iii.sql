# Write your MySQL query statement below
Select p.product_id,p.product_name from Product p Join Sales s on p.product_id=s.product_id 
Group By p.product_id 
Having MIN(s.sale_date) >= '2019-01-01'  AND MAX(s.sale_date) <= '2019-03-31'