import java.util.*;

class Solution {
    List<String> dictionary = new ArrayList<>();
    char[] vowels = {'A', 'E', 'I', 'O', 'U'};

    public void generateWords(String word) {
        if (word.length() > 5) return; // 최대 길이 5 초과 시 중단
        dictionary.add(word); // 현재 단어 저장
        System.out.println(word);
        
        for (char c : vowels) { // A, E, I, O, U 순서대로 붙이면서 탐색
            generateWords(word + c);
        }
    }

    public int solution(String word) {
        generateWords(""); // 빈 문자열부터 모든 경우의 수 생성
        Collections.sort(dictionary); // 사전순 정렬
        return dictionary.indexOf(word); // 해당 단어의 위치 반환
    }
}