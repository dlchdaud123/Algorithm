import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 1; i < n+1; i++){
            answer[i-1] = (long) i * x;
        }
        return answer;
    }
}