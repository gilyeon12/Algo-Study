-- �ִ� ���ϱ�
SELECT DATETIME as �ð�
from ANIMAL_INS
order by DATETIME DESC
limit 1;

-- �ִ� ���ϱ� (�����Լ� ���)
SELECT MAX(DATETIME) as �ð�
from ANIMAL_INS;

-- �ּڰ� ���ϱ�
SELECT MIN(DATETIME) AS �ð�
FROM ANIMAL_INS;

-- ���� �� ���ϱ�
SELECT COUNT(ANIMAL_ID) AS count
FROM ANIMAL_INS;

-- �ߺ� �����ϱ�
SELECT COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;