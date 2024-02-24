# Write your MySQL query statement below

select name as employee from employee a where salary>(select salary from employee b where  b.id=a.managerId);