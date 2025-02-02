import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // 연속된 중복 값을 제거한 결과를 저장할 리스트 생성
        List<Integer> resultList = new ArrayList<>(); 
        
        // 첫 번째 요소는 무조건 추가
        resultList.add(arr[0]); 
        
        // 배열을 순회하며 연속된 중복 요소 제거
        for (int i = 0; i < arr.length; i++) {
            // 현재 요소가 resultList의 마지막 요소와 다르면 추가
            if (arr[i] != resultList.get(resultList.size() - 1)) {
                resultList.add(arr[i]);
            }
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            // 리스트의 요소를 배열에 복사
            answer[i] = resultList.get(i); 
        }
        // 중복이 제거된 배열 반환
        return answer; 
    }
}