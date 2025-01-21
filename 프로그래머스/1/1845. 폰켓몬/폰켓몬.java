import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> poke = new HashMap<>();
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            // 루프 돌면서 처음 나오는 종류는 디폴트값 0
            // 같은 종류가 다시 나오면 1++
            poke.put(nums[i], poke.getOrDefault(nums[i], 0) + 1);
        }
        for(int num:nums){
            System.out.println(poke.get(num));
        }
        
        int uniqueCount = poke.size();
        int maxPick = nums.length / 2;
        
        System.out.println("pokesize"+poke.size()); // 폰켓몬 종류
        System.out.println("nums.length"+nums.length/2); // 폰켓몬 마리수/2
        
        // [3,3,3,3] 일때 -> pokesize(폰켓몬 종류) : 1
        // [3,1,2,3] 일때 -> 폰켓몬 마리수/2(가져갈 수 있는 종류 수의 최댓값) : 2
        answer = Math.min(uniqueCount, maxPick);
        
        return answer;
    }
}