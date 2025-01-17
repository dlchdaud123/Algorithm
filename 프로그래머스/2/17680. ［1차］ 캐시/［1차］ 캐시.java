import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        for(int i = 0; i < cities.length; i++){
            String city = cities[i].toUpperCase();
            // 캐시에 포함되어 있다면
            if(cache.contains(city)){
                cache.remove(city);
                cache.add(city);
                answer += 1;
            }
            
            // 캐시에 포함되어 있지 않다면
            else{
                // 캐시가 다 찼다면
                if(cache.size() == cacheSize){
                    // 맨 앞을 제거
                    cache.remove(0);
                }
                // 맨 뒤어 새로운 값 add
                cache.add(city);
                answer += 5;
            }
        }
        return answer;
    }
}
/*
cache크기는 스택의 크기
스택
*/