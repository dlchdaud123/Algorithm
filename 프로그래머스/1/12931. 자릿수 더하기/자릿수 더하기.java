import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i < 100; i++){

                answer += n % 10;
            if(n<10){
                break;
            }   
            n = n / 10;
        }
        return answer;
    }
}