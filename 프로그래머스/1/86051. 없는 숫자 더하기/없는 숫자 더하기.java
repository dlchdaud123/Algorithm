class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        int answer = -1;
        answer = 45 - sum;        
        return answer;
    }
}