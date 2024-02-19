# Write your MySQL query statement below
select distinct email from person a where email=(select distinct email from person b where b.email=a.email and a.id>b.id)