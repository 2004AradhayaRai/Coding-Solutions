# Write your MySQL query statement below
Select user_id, count(Distinct follower_id) as followers_count from Followers 
Group by user_id
Order by user_id;