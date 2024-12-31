-- 코드를 입력하세요
SELECT outs.ANIMAL_ID, outs.NAME
FROM ANIMAL_OUTS outs
LEFT JOIN ANIMAL_INS ins
ON outs.ANIMAL_ID = ins.ANIMAL_ID
ORDER BY outs.DATETIME - ins.DATETIME DESC
LIMIT 2


-- outs.Date - ins.Date가 큰 순으로 2개 출력
