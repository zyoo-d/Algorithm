-- 코드를 입력하세요
SELECT
    pt_name,
    pt_no,
    gend_cd,
    age,
    case
        when tlno is not null then tlno
        else 'NONE'
    end
from patient
    where age <= 12 and gend_cd = 'W'
        order by age desc, pt_name asc;