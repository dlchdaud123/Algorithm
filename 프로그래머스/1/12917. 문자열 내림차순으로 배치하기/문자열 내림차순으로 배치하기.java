import java.util.*;
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        String answer = "";
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){
            answer += arr[i];
        }
        return answer;
    }
}