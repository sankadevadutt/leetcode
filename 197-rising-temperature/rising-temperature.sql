# Write your MySQL query statement below
select
    w1.id
from
    weather w1
where temperature > (select temperature from weather where DATEDIFF(w1.recordDate, recordDate) = 1);