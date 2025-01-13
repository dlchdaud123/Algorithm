import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // 배열을 내림차순 정렬
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        int hIndex = 0;

        // H-Index 계산
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= i + 1) {
                hIndex = i + 1; // H-Index 후보
            } else {
                break; // 조건 불만족 시 종료
            }
        }

        return hIndex;
    }
}