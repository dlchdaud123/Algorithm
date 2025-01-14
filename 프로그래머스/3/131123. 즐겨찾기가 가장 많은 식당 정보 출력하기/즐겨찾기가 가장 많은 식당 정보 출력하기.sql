-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from rest_info
where (FOOD_TYPE, FAVORITES)
in
    (SELECT FOOD_TYPE, MAX(FAVORITES)
     FROM REST_INFO
     GROUP BY FOOD_TYPE) 
ORDER BY FOOD_TYPE DESC;

# GROUP BY로 묶으면 가장 상단에 있는 데이터들을 임의로 가져옵니다. 
# 고로 결과물이 같은거 같지만 이는 우연히 가장 상단에 식당정보를 가져온것이 같은것이지
# 가장 즐겨찾기가 많은 식당이 아니였다 이에 대한 이유는 
# SQL 쿼리의 진행순서떄문이라고 한다 