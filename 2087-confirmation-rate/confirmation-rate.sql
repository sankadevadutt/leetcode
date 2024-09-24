# Write your MySQL query statement below
with temp as(
    select s.user_id,c.action,
    case c.action
        when 'confirmed' then 1
        else 0
    end as conf
    from signups s
    left join confirmations c on c.user_id = s.user_id
)
select user_id, ROUND(AVG(conf),2) as confirmation_rate
from temp
group by user_id;