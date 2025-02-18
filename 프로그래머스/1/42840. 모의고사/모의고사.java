import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == student1[i % student1.length]){
                score1++;
            }
            if(answers[i] == student2[i % student2.length]){
                score2++;
            }
            if(answers[i] == student3[i % student3.length]){
                score3++;
            }
            
        }
        
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        List<Integer> result = new ArrayList<>();
        if(score1 == maxScore) result.add(1);
        if(score2 == maxScore) result.add(2);
        if(score3 == maxScore) result.add(3);
        
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}

/*
1번 12345...
2번 21 23 24 25...
3번 33 11 22 44 55...
*/