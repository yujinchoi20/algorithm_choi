-- 코드를 입력하세요
SELECT OUTS.ANIMAL_ID, OUTS.NAME 
FROM ANIMAL_INS AS INS RIGHT JOIN ANIMAL_OUTS AS OUTS 
ON INS.ANIMAL_ID=OUTS.ANIMAL_ID
WHERE INS.ANIMAL_ID IS NULL
ORDER BY ANIMAL_ID;