import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>(); // {index, priority} 형태로 저장
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 정렬
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
            priorityQueue.offer(priorities[i]);
        }
        
        int answer = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if (current[1] == priorityQueue.peek()) { // 현재 프로세스가 가장 높은 우선순위
                answer++;
                priorityQueue.poll();
                if (current[0] == location) {
                    return answer;
                }
            } else {
                queue.offer(current); // 우선순위가 아니면 다시 큐에 추가
            }
        }
        
        return answer;
    }
}