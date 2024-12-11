class Solution {
    public int solution(int[] arr) {
        int i = 1;
        int match_cnt = 0;
        for(i = 1; i < 100000000; i++){ //최소공배수 
            match_cnt = 0;
            for(int j = 0; j < arr.length; j++){ //i를 배열의 각 수로 나눠서 떨어진다면
                if(i % arr[j] == 0){
                    match_cnt++;
                }
                if(match_cnt == arr.length){
                    return i;
                }
            }
        }
        return i;
    }
}

