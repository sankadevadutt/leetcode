# Write your MySQL query statement below
select e1.name, b.bonus
from employee e1
left join bonus b
on b.empid = e1.empid
where b.bonus < 1000 or b.bonus is null;