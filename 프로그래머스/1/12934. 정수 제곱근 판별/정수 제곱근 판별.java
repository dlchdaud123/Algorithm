import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt % 1 == 0){
             return answer = (long)Math.pow(sqrt + 1, 2);
        }
        return answer = -1;
    }
}