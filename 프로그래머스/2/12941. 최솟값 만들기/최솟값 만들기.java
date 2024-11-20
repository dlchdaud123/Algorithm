import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++){
            // System.out.println(A[i] + " " + B[A.length - 1 - i]);
            answer += A[i] * B[A.length - 1 - i];
        }
        
        return answer;
    }
}
/*
A에서는 최대값만 뽑고 B에서는 최소값만 뽑자 
한번 사용한 배열의 요소는 0로 바꿔서 arr > 0 && 최댓값 / arr > 0 && 최소값

*/