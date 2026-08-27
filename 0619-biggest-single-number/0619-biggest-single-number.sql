# Write your MySQL query statement below
select Max(num) as num from MyNumbers where num in (
    select num from MyNumbers Group by num having count(*)=1
)