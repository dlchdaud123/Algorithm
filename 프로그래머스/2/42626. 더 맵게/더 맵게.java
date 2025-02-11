import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++){
            minHeap.add(scoville[i]);
        }
        while(minHeap.size() != 1){
            if(minHeap.peek() >= K){ // 모든 스코빌 요소가 k 이상일때
                break;
            }
            minHeap.add(minHeap.poll() + (minHeap.poll() * 2));
            answer++;
        }
        
        if(minHeap.size() == 1 && minHeap.peek() < K){
            answer = -1;
        }
        
        return answer;
    }
}

/*
모든 음식의 스코빌 지수가 7 이상

*/