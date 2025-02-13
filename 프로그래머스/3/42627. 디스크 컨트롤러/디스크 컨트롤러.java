import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 1. 요청 시간이 빠른 순으로 정렬
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));

        // 2. 우선순위 큐 (소요 시간이 짧은 순서)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        int currentTime = 0;  // 현재 시간
        int totalWaitTime = 0;  // 총 대기 시간
        int index = 0;  // jobs 배열 인덱스
        int count = 0;  // 완료된 작업 수

        while (count < jobs.length) {
            // 현재 시간 이하에서 실행 가능한 작업들을 우선순위 큐에 추가
            while (index < jobs.length && jobs[index][0] <= currentTime) {
                pq.offer(jobs[index]);
                index++;
            }

            // 실행 가능한 작업이 있다면 수행
            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                currentTime += job[1]; // 현재 시간 업데이트
                totalWaitTime += (currentTime - job[0]); // 요청부터 종료까지 걸린 시간
                count++;
            } else {
                // 실행할 수 있는 작업이 없으면, 현재 시간을 가장 빠른 요청 시간으로 이동
                currentTime = jobs[index][0];
            }
        }

        // 평균 대기 시간 반환
        return totalWaitTime / jobs.length;
    }
}