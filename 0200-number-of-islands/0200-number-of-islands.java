class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][]vis=new boolean[m][n];
    int component=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(!vis[i][j]&&grid[i][j]=='1'){
                
                    BFS(i,j,grid,vis);
                    component++;
                    
                
            }
        }
    }
    return component;
    }
public void BFS(int row, int col, char[][] grid, boolean[][] vis) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

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
                    grid[newrow][newcol] == '1' &&
                    !vis[newrow][newcol]) {

                    q.offer(new int[]{newrow, newcol});
                    vis[newrow][newcol] = true;
                }
            }
        }
    }
}



