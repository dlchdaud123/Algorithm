import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] board;
    static boolean[][][][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};

    static class State {
        int rx, ry, bx, by, cnt;
        State(int rx, int ry, int bx, int by, int cnt) {
            this.rx = rx; this.ry = ry; this.bx = bx; this.by = by; this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];

        int rx = 0, ry = 0, bx = 0, by = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                char c = line.charAt(j);
                if (c == 'R') { rx = i; ry = j; board[i][j] = '.'; }
                else if (c == 'B') { bx = i; by = j; board[i][j] = '.'; }
                else board[i][j] = c;
            }
        }

        visited = new boolean[N][M][N][M];
        System.out.println(bfs(rx, ry, bx, by));
    }

    static int bfs(int rx, int ry, int bx, int by) {
        Queue<State> q = new LinkedList<>();
        q.add(new State(rx, ry, bx, by, 0));
        visited[rx][ry][bx][by] = true;

        while (!q.isEmpty()) {
            State cur = q.poll();
            if (cur.cnt >= 10) continue;

            for (int dir = 0; dir < 4; dir++) {
                int[] rMove = roll(cur.rx, cur.ry, dir);
                int[] bMove = roll(cur.bx, cur.by, dir);

                // 파란 구슬이 구멍이면 실패
                if (bMove[2] == 1) continue;

                // 빨간 구슬만 구멍이면 성공
                if (rMove[2] == 1) return 1;

                // 둘 다 같은 위치면 더 많이 이동한 구슬을 한 칸 뒤로
                if (rMove[0] == bMove[0] && rMove[1] == bMove[1]) {
                    if (rMove[3] > bMove[3]) {
                        rMove[0] -= dx[dir];
                        rMove[1] -= dy[dir];
                    } else {
                        bMove[0] -= dx[dir];
                        bMove[1] -= dy[dir];
                    }
                }

                if (!visited[rMove[0]][rMove[1]][bMove[0]][bMove[1]]) {
                    visited[rMove[0]][rMove[1]][bMove[0]][bMove[1]] = true;
                    q.add(new State(rMove[0], rMove[1], bMove[0], bMove[1], cur.cnt + 1));
                }
            }
        }
        return 0;
    }

    static int[] roll(int x, int y, int dir) {
        int dist = 0;
        while (board[x + dx[dir]][y + dy[dir]] != '#') {
            x += dx[dir];
            y += dy[dir];
            dist++;
            if (board[x][y] == 'O') return new int[]{x, y, 1, dist};
        }
        return new int[]{x, y, 0, dist};
    }
}