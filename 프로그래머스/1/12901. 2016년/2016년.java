class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int days = 0;
        // 만약 a가 1월이라면 b를 7로 나누고 answer에 더해줌
        // 만약 a가 2월 이상이라면 month[a-1]까지 더해줌, 그리고나서 b 를 7로 나누고 더해줌
            for(int i = 0; i < a - 1; i++){
                days += month[i];
            }
            days += b - 1;
            answer = week[days%7];
        return answer;
    }
}