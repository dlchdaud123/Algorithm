class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        a -= 1;
        b -= 1;
        for(int i = 0; i < 20; i++){
            // if(a%2 == 1){
            //     a++;
            // }
            // if(b%2 == 1){
            //     b++;
            // }
            a /= 2;
            b /= 2;
            answer++;
            if(a == b){
                return answer;
            }
        }
        return answer;
    }
}

/* 
A, B는 항상 이김
2로 나눈 나머지가 1이면 1 더해서 나누기 2 아니면 그냥 나누기 2
만약 두수가 같다면 answer 반환
answer++

*/