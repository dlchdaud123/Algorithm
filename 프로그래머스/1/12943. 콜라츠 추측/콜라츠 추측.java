class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while(num != 1){
            // 만약 작업 수가 500이라면 작업 수를 -1로 바꾸고 종료
            if(answer == 500){
                answer = -1;
                break;
            }
            
            // 입력된 수가 짝수 이면 2로 나눈다.
            if(num % 2 == 0) num /= 2;
            // 홀수면 3 곱하고 1 더한다.
            else{
                num = num * 3 + 1;
            }
            // 작업 수
            answer++;
        }
        return answer;
    }
}