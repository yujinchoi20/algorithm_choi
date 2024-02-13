-- 코드를 입력하세요
select flavor
from (select * from first_half union select * from july) total
group by total.flavor
order by sum(total_order) desc
limit 3;