import java.util.*;

class Solution {
    public Long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        String answer_str = "";
        for(int i = arr.length - 1; i >= 0; i--){
            answer_str += arr[i];
        }
        answer = Long.parseLong(answer_str);
        return answer;
    }
}