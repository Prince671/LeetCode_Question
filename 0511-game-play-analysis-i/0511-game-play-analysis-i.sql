# Write your MySQL query statement below

select a.player_id, a.event_date as first_login from Activity as a WHERE a.event_date=(
    select min(a2.event_date) from Activity as a2 WHERE a.player_id=a2.player_id
);