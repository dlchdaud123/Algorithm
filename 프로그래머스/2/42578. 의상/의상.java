import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        for(String key: map.keySet()){
            answer *= (map.get(key) + 1);
        }
        
        
        return answer - 1;
    }
}

/*
각각 하나씩 -> 악세사리 종류 N
해드기어+1(아예안쓰는 경우) * 얼굴+1 * 상의+1 * 하의+1 * 겉옷+1 = X
N + X => 답
*/