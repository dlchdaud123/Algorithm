import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i = 2; i <= brown + yellow; i++){
            int j = (brown + yellow) / i;
            if((i + j) == ((brown + 4) / 2) && (i * j) == (brown + yellow)){
                answer[0] = i;
                answer[1] = j;
            }
        }
        
        return answer;
    }
}

// *a < b
// 카펫의 칸 = 갈색 + 노란색
// 카팻의 칸 = a * b
// 갈색 + 노란색 = a * b
// 카펫의 테두리는 무조건 갈색
// -> 리턴 값 각각을 더하고 -4 하면 테두리 갈색의 값
// (a + b) * 2 - 4 = 갈색의 값
// (a + b) = (갈색의 값 + 4) / 2
// a > yellow, b < brown

// 길색 + 노란색 = a * b
// (갈색 + 4) / 2 = a + b
