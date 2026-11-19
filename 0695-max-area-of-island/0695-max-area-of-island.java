
import java.util.*;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int maxans = 0;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (!vis[i][j] && grid[i][j] == 1) {

                    int ans = BFS(i, j, grid, vis);

                    maxans = Math.max(maxans, ans);
                }
            }
        }

        return maxans;
    }

    public static int BFS(int row, int col, int[][] grid, boolean[][] vis) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int ans = 1;

        q.offer(new int[]{row, col});
        vis[row][col] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] arr = q.poll();

            int r = arr[0];
            int c = arr[1];

            for (int i = 0; i < 4; i++) {

                int newrow = r + dr[i];
                int newcol = c + dc[i];

                if (newrow >= 0 && newrow < m &&
                    newcol >= 0 && newcol < n &&
                    grid[newrow][newcol] == 1 &&
                    !vis[newrow][newcol]) {

                    ans++;

                    q.offer(new int[]{newrow, newcol});
                    vis[newrow][newcol] = true;
                }
            }
        }

        return ans;
    }
}
