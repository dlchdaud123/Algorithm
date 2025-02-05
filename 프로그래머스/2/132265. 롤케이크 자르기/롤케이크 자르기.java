import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> set = new HashMap<>(); // 전체 토핑
        Map<Integer, Integer> partSet = new HashMap<>(); // 부분 토핑
        
        // 전체 토핑 초기화
        for(int toppings : topping){
            set.put(toppings, set.getOrDefault(toppings, 0) + 1);
        }
        
        for(int toppings : topping){
            partSet.put(toppings, partSet.getOrDefault(toppings, 0) + 1);
            
            set.put(toppings, set.get(toppings) - 1);
            if(set.get(toppings) == 0){
                set.remove(toppings);
            }
            
            if(partSet.size() == set.size()){
                answer++;
            }
        }
        return answer;
    }
}

/*
해쉬 맵(종류, 갯수)을 만들어서 유니크 하게 토핑 종류 수집후 비교
토핑 전체 해쉬맵
토핑 전체 해쉬맵에서 idx 0 부터 하나씩 뺴서 토핑 부분 해쉬맵에 하나씩 get or default 0, +1
각각의 토핑 종류 비교 -> size 활용 사이즈가 같다면 answer++
answer return
*/