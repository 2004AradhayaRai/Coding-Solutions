# Write your MySQL query statement below

Select u.user_id as buyer_id , u.join_date , COUNT(o.order_id) as  orders_in_2019
from Users u Left join Orders o ON u.user_id = o.buyer_id AND YEAR(order_date) = '2019'
Group by u.user_id