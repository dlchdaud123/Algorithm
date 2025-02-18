import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));
        
        String answer = String.join("", strNumbers);
        
        return answer.startsWith("0") ? "0" : answer;
    }
}