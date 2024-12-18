import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        for(int i = 0; i < people.length; i++){
            // System.out.println(people[i]);
        }
        // System.out.println();
        int min = 0;
        int max = people.length - 1;
        while(true){
            if(people[min] + people[max] <= limit){
                answer++;
                // System.out.println(people[min]+" "+people[max]);
                min++; max--;
            }
            else{
                answer++;
                // System.out.println(people[max]);
                max--;
            }
            if(min == max){ // 한사람만 남았을때
                answer++;
                // System.out.println("break");
                break;
            }
            if(min > max){
                break;
            }
                
        }
        return answer;
    }
}

// 최솟값 + 최댓값 <= 리밋 -> ans++, min++ max--
// 최솟값 + 최댓값 > 리밋 -> ans++, max--  (몸무게 많이 나가는 사람 한사람만 태움)
// min == max (한사람만 남았을때) -> ans++
// min > max -> break; -> 끝
