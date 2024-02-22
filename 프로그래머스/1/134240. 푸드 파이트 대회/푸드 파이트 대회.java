class Solution {
    public String solution(int[] food) {
        String answer = "";
        String left = "";
        String right = "";
        
        for(int i = 1; i < food.length; i++){ // 음식 종류
            if(food[i] != 0){
                for(int j = 0; j < (food[i]/2); j++){
                    left += Integer.toString(i);
                }
            }
        }
        StringBuffer sb = new StringBuffer(left);
        right = sb.reverse().toString();
        answer = left+"0"+right;
        
        return answer;
    }
}