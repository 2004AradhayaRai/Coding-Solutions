# Write your MySQL query statement below
Select w2.id from Weather w1 Cross Join Weather w2 On DATEDIFF(w2.recordDate,w1.recordDate) = 1 
where
 w1.temperature<w2.temperature