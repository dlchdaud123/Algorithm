class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // a - 콜라 받기 위해 마트에 주어야 하는 병 수
        // b - 빈병 a 개를 가져다 주면 마트가 주는 콜라 병 수
        // n - 상빈이 가지고 있는 빈 병의 수
        // while(n < 3) 
        // n - (n보다 작은 수 중에 제일 큰 a의 배수) + b * (n / a) 
        // answer += (n / a);
        
        while(true){
            answer += b * (n / a);
            n = b * (n / a) + (n % a);
            if(n < a)
                break;
        }
        return answer;
    }
}