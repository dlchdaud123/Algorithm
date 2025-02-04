import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int currentWeight = 0; // 현재 다리 위 트럭 총 무게
        int time = 0; // 걸리는 시간
        
        // 트럭 갯수만큼 순회
        for(int truck : truck_weights){
            while (true) {
                if(bridge.size() == bridge_length) {
                    currentWeight -= bridge.poll();
                }
                
                if (currentWeight + truck <= weight) {
                    bridge.add(truck);
                    currentWeight += truck;
                    time++;
                    break;
                } else {
                    bridge.add(0);
                    time++;
                }
            }
        }
        return time + bridge_length;
    }
}

/*
bridge_length 만큼 트럭 올라갈 수 있음
다리위에 있는 트럭의 weight 가 넘지 않는 선에서 트럭이 올라갈 수 있음
건너는 시간은 bridge_length 만큼
*/