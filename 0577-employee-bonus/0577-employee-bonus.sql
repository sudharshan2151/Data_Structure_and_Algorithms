# Write your MySQL query statement below

select  a.name, b.bonus from employee a left join bonus b on b.empId=a.empId where bonus<1000 or b.empId is null;;
