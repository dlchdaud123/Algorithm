import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 이름의 갯수를 센다.
        for(String i:participant){
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        // 완주자 이름의 갯수를 세고 참가자 이름의 갯수에서 뺸다.
        for(String j:completion){
            map.put(j, map.get(j) -1);
        }
        // 참가자 이름의 갯수가 완주자 이름 목록에서 제거 되지 않고 1 이상 남아있으면 정답으로 반환
        for(String k:map.keySet()){
            if(map.get(k) > 0)
            return k;
        }
        return answer;
    }
}