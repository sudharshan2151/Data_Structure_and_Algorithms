# Write your MySQL query statement below
select a.project_id, ROUND(AVG(experience_years),2) as average_years from project a inner join employee b on b.employee_id=a.employee_id group by project_id order by a.project_id;
