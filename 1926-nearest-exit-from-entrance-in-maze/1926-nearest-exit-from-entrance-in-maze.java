class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {

        int m = maze.length;
        int n = maze[0].length;

        Queue<int[]> q = new LinkedList<>();

        int er = entrance[0];
        int ec = entrance[1];

        q.offer(new int[]{er, ec, 0});

        boolean[][] visited = new boolean[m][n];

        visited[er][ec] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int steps = curr[2];

            // Check if current cell is an exit
            if ((r == 0 || r == m - 1 ||
                 c == 0 || c == n - 1)
                && !(r == er && c == ec)) {

                return steps;
            }

            // Explore four directions
            for (int i = 0; i < 4; i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    maze[nr][nc] == '.' &&
                    !visited[nr][nc]) {

                    visited[nr][nc] = true;

                    q.offer(new int[]{
                        nr, nc, steps + 1
                    });
                }
            }
        }

        return -1;
    }
}