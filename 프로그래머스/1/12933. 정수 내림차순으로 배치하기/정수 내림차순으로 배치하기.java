import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        String newstr = new String();
        for(int i = arr.length-1; i >= 0; i--){
            newstr+= arr[i];
        }
        
        answer = Long.parseLong(newstr);
        return answer;
    }
}