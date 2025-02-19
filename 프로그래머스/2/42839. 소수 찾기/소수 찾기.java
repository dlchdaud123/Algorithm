import java.util.*;

class Solution {
    static Set<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        char[] numArr = numbers.toCharArray();
        boolean[] visited = new boolean[numArr.length];
        generatePermutations(numArr, visited, "");
        
        int count = 0;
        for(int num: numberSet) {
            if(isPrime(num)) count++;
        }
        return count;
    }
    
    public static void generatePermutations(char[] numArr, boolean[] visited, String current) {
        if (!current.isEmpty()) {
            numberSet.add(Integer.parseInt(current));
        }
        
        for (int i = 0; i < numArr.length; i++){
            if (!visited[i]) {
                visited[i] = true;
                generatePermutations(numArr, visited, current + numArr[i]);
                visited[i] = false;
            }
        }
    }
    
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}