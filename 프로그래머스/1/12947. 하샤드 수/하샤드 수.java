class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int eachSum = 0;
        int original = x;
        while(true){
            if(x < 10){
                eachSum += x;
                break;
            }
            eachSum += x % 10;
            x = x / 10;
        }
        if(original % eachSum != 0){
            answer = false;
        }
        return answer;
    }
}