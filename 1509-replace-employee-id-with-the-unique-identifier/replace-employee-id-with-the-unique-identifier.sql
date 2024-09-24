# Write your MySQL query statement below
select 
    e2.unique_id, e.name 
from employees e
left join employeeuni e2
on e2.id = e.id;