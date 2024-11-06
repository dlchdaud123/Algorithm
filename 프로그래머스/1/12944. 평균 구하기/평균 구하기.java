class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}