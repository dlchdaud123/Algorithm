import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n+m];
        
        for(int i = 0; i < section.length; i++){
            arr[section[i] - 1] = 1;
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){ // 1을 발견하면 m의 길이 만큼 0으로 바꾸기
                for(int j = i; j < m+i; j++){
                    if(arr[j] == 1){
                        arr[j] = 0;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}