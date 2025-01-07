-- 코드를 입력하세요
SELECT distinct(car.CAR_ID)
FROM CAR_RENTAL_COMPANY_CAR AS car
LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS his
ON car.CAR_ID = his.CAR_ID
WHERE car.CAR_TYPE = '세단' AND (DATE_FORMAT(his.START_DATE, '%Y-%m') = '2022-10' OR his.END_DATE IS NULL)
ORDER BY car.CAR_ID DESC