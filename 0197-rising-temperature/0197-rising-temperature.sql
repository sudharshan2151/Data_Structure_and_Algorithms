# Write your MySQL query statement belows
select id from weather a where a.temperature> (select b.temperature from weather b where b.recordDate=(a.recordDate-INTERVAL 1 DAY));