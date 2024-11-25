import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() == 0){ // 문자열의 길이가 0이라면 공백 추가
                answer += " ";
            } 
            
            else{
                answer += arr[i].substring(0, 1).toUpperCase();
                answer += arr[i].substring(1, arr[i].length()).toLowerCase();
                answer += " ";
            }
            
        }
        if(s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        
        return answer.substring(0, answer.length() - 1);
    }
}
// split(" ")으로 공백 기준으로 분류하고
// arr_str[]의 각각의 값을 toCharArray()를 이용해서 arr_char[]로 바꾼후
// toUpperCase를 통해서 인덱스가 0인 것만 대문자로 바꿔서 출력