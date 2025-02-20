import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        // 1. 그래프를 인접 리스트로 표현
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new HashSet<>()); // 각 노드를 위한 Set 추가
        }
        
        // 2. 주어진 간선 정보를 이용해 양방향 그래프 구성
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int minDiff = Integer.MAX_VALUE; // 최소 차이를 저장할 변수
        
        // 3. 간선을 하나씩 제거하면서 네트워크 크기 비교
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];

            // (1) 간선 제거
            graph.get(a).remove(b);
            graph.get(b).remove(a);

            // (2) BFS 실행 → 한 쪽 네트워크의 노드 개수 확인
            int count = bfs(n, graph, a);

            // (3) 크기 차이 계산 및 최소값 갱신
            int diff = Math.abs((n - count) - count);
            minDiff = Math.min(minDiff, diff);

            // (4) 간선 복구 (원래 상태로 돌려놓기)
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        return minDiff;
    }

    // BFS를 사용해 연결된 노드 개수 찾기
    private int bfs(int n, List<Set<Integer>> graph, int start) {
        boolean[] visited = new boolean[n + 1]; // 방문 여부 체크 배열
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        
        int count = 0; // 연결된 노드 개수
        
        while (!queue.isEmpty()) {
            int node = queue.poll(); // 큐에서 노드를 꺼냄
            count++;
            
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) { // 방문하지 않은 노드만 추가
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        
        return count;
    }
}