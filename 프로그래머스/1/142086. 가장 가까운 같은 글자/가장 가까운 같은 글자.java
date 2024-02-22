class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        answer[0] = -1; // 맨 처음은 무조건 -1
        for(int i = 1; i < s.length(); i++){
            int idx = -1;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    idx = i-j;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}