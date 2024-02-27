import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        // 배열을 오름차순으로 배열
        // 뒤에서 부터 내려와서 m개로 쪼개지는 부분 * m 을 result에 더해줌
        // 만약 고를 수 있는 거 m개가 안된다면 점수 리턴
        int answer = 0;
        Arrays.sort(score);
        
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;    
        }
        
        return answer;
    }
}