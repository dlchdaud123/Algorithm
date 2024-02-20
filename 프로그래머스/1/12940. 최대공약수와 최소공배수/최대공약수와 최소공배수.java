class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        //최대 공약수 구하기
        for(int i = 1; i <= b; i++){
            if(a % i == 0 && b % i == 0){
                answer[0] = i;
            }
        }
        //최소 공배수 구하기
        answer[1] = a * b / answer[0];
        
        return answer;
    }
}