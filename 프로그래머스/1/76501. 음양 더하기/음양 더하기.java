class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == false){
                sum = sum + (absolutes[i] * -1);
            }
            else{
                sum = sum + (absolutes[i]);
            }
        }
        return sum;
    }
}