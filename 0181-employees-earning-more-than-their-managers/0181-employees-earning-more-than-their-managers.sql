# Write your MySQL query statement below

select name as employee from employee a where salary>(select salary from employee b where a.salary>b.salary and b.id=a.managerId);