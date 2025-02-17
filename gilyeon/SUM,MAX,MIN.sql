-- 최댓값 구하기
SELECT DATETIME as 시간
from ANIMAL_INS
order by DATETIME DESC
limit 1;

-- 최댓값 구하기 (집계함수 사용)
SELECT MAX(DATETIME) as 시간
from ANIMAL_INS;

-- 최솟값 구하기
SELECT MIN(DATETIME) AS 시간
FROM ANIMAL_INS;

-- 동물 수 구하기
SELECT COUNT(ANIMAL_ID) AS count
FROM ANIMAL_INS;

-- 중복 제거하기
SELECT COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;