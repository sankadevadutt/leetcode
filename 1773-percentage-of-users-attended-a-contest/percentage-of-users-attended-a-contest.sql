# Write your MySQL query statement below
select contest_id, ROUND(count(distinct user_id)/(select count(user_id) from users) * 100, 2) as percentage 
from register
group by contest_id
order by percentage desc, contest_id ;