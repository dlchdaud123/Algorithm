import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 처음과 끝의 "{{", "}}"을 제거 해줌
        s = s.substring(2, s.length()-2);
        // },{ 기준으로 나눠줌
        String[] sets = s.split("},\\{");
        // 길이를 기준으로 집합을 정렬 (오름차순)
        Arrays.sort(sets, Comparator.comparingInt(String::length));
        // 유일성을 보장해주기 위해 hashSet사용
        Set<Integer> resultSet = new LinkedHashSet<>();
        for (String set : sets) {
            String[] elements = set.split(",");
            for(String element:elements){
                // hashSet이므로 똑같은거 들어와도 유일성 보장
                resultSet.add(Integer.parseInt(element));
            }
        }
        
        int[] result = new int[resultSet.size()];
        int index = 0;
        for(int num: resultSet){
            result[index++] = num;
        }
        
        return result;
    }
}
/*
한자리수 배열이 제일 앞

*/