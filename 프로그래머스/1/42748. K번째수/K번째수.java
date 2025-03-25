import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1] - 1;
            int k = command[2] - 1;
            
            int[] temp = new int[end - start + 1];
            int index = 0;
            for(int j = start; j <= end; j++){
                temp[index++] = array[j];
            }
            
            Arrays.sort(temp);
            
            answer[i] = temp[k];
        }
        return answer;
    }
}