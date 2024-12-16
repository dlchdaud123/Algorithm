class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        for(int i = 1; i < words.length; i++){
            //앞 단어의 마지막 알파벳과 다음 단어의 알파벳이 다를때
            if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            for(int j = 0; j < i; j++){
                //나온 단어가 나오면 틀린답
                if(words[j].equals(words[i])){ 
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }
            if (answer[0] != 0) break;
        }
        return answer;
    }
}

// 틀린 인덱스를 찾아서 n으로 나누고 나머지가 [번호]
// 몫이 [차례]
// 나온 단어도 비교해서 틀린 답처리 - 현재 인덱스의 번호, 몫 반환
// 앞 단어의 마지막 알파벳과 현재 단어의 앞 알파벳이 다르면 틀린 답처리 - 현재 인덱스의 번호, 몫 반환