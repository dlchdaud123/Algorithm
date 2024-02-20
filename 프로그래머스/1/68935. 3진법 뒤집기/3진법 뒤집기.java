import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int temp = n;
        int i = 0;
        int j = 0;
        int sum = 0;
        
        while(true){
            if(temp < 3){
                cnt++;
                temp = n;
                break;
            }
            temp = temp / 3;
            cnt++;
        }
        int[] arr = new int[cnt];
        
        while(true){
            if(n < 3){
                arr[i++] = n;
                break;
            }
            arr[i++] = n % 3;
            n = n / 3;
        }
        for(i = arr.length - 1; i >= 0; i--){
            sum += arr[i] * Math.pow(3, j++);
        }
        return sum;
    }
}