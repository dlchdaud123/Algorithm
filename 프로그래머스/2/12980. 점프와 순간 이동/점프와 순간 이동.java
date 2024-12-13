import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n -= 1;
                ans++;
            }
        }
        return ans;
    }
}

// 맨처음은 무조건 점프 한번
// 이후 현재까지 온거리 * 2 해서 순간이동으로 k 근접까지
// 홀수면 마지막에 한번 점프

// 5000 2500 1250 625 -1 624 312 156 78 39 -1 38 19 -1 18 9 -1 8 4
// 2 1 -1

// N 을 2로 나누기 if 홀수면 -1
