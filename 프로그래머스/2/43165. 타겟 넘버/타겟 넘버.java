class Solution {
    int count = 0; // 정답 개수를 저장하는 변수

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }

    void dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) { // 모든 숫자를 사용했을 때
            if (sum == target) { // 목표값과 같으면 카운트 증가
                count++;
            }
            return;
        }

        // 현재 숫자를 더하는 경우
        dfs(numbers, target, index + 1, sum + numbers[index]);

        // 현재 숫자를 빼는 경우
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}