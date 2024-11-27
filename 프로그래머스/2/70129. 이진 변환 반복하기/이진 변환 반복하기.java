import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        answer[0] = 0; // 이진변환 횟수
        answer[1] = 0; // 0제거 횟수
        int cnt_0 = 0;
        int cnt_1 = 0;
        
        while(true){
            cnt_0 = 0;
            cnt_1 = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    cnt_0++;
                }
            }
            System.out.println(s.charAt(0));
        
            cnt_1 = s.length() - cnt_0;
            s = Integer.toBinaryString(cnt_1);
            answer[1] += cnt_0;
            
            System.out.println(s);
            System.out.println(answer[1]);
            
            answer[0]++;
            if(s.equals("1")){
                break;
            }
        }
        
        return answer;
    }
}
/*
반복문 돌고 0의 갯수, 1의 갯수를 세기
1의 갯수만큼 1로 s로 변경, 이진변환 횟수++
그 수를 이진수로 변경
s가 1이 되면 이진변환 횟수, 0제거 갯수 반환
*/