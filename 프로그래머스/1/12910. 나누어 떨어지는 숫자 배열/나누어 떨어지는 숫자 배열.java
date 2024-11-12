import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                cnt++;
            }
        }
        int answer[] = new int[cnt];
        
        if(cnt == 0){
            return new int[] {-1};
        }
        
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[j++] = arr[i];
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}