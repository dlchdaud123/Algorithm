class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int eachSum = 0;
        int ori = x;
        while(true){
            if(x < 10){
                eachSum += x;
                break;
            }
            eachSum += x % 10;
            x = x / 10;
        }
        if(ori % eachSum == 0){
            return answer;
        }
        else
            answer = false;
            return answer;
    }
}