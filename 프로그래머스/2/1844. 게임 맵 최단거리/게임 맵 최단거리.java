import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // n = 가로, m = 세로
        int n = maps.length, m = maps[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1}); // x, y 이동 거리
        
        // 큐가 비어있지 않은 동안
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], dist = curr[2];
            
            if(x == n - 1 && y == m - 1) return dist;
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1){
                    queue.add(new int[]{nx, ny, dist + 1});
                    maps[nx][ny] = 0;
                }
            }
        }
        return -1;
    }
}