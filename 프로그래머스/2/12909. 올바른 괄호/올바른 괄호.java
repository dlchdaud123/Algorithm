import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        answer = stack.empty();
        return answer;
    }
}
/* 
입출력 예 3번을 보면 각각 짝수여도 올바른 괄호가 아닐 수 있음
string s를 char array 로 바꿔서 인덱스 0부터 하나씩 스택에 삽입
0번째 인덱스는 그냥 삽입 하고 그 이후 인덱스 부터 i, i-1이 각각 '(', ')'인지 파악 하고 맞으면 팝팝 아니면 넘어감
나중에 empty인지 확인하고 맞으면 true, 틀리면 false
*/