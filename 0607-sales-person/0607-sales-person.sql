# Write your MySQL query statement below

Select sp.name from SalesPerson as sp 
where sp.sales_id NOT in (
    Select o.sales_id from Orders as o
    Left Join Company c ON o.com_id=c.com_id where c.name = 'RED'
)
