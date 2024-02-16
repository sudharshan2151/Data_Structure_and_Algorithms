# Write your MySQL query statement below
select user_id, count(*) as followers_count from followers a group by follower_id=user_id,user_id order by user_id ;
