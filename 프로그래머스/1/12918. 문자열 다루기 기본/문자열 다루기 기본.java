class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(4 == arr.length || arr.length == 6){
                
            }
            else{
                answer = false;
                return answer;
            }
            if('0' <= arr[i] && arr[i] <= '9'){
            }
            else{
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}