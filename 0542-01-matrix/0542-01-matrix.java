class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]>q=new LinkedList<>();
        int[][]dis=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
if(mat[i][j]==0){
    q.offer(new int[]{i,j,0});

}


            }
        }


         int[]dr={-1,1,0,0};
       int[]dc={0,0,-1,1};

        boolean[][] visited = new boolean[m][n];

        // Mark all starting 0 cells visited
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }
    while(!q.isEmpty()){
int size=q.size();

int []curr=q.poll();
int r=curr[0];
int c=curr[1];
int steps=curr[2];
dis[r][c]=steps;
    
    for(int d=0;d<4;d++)
{
    int nr=r+dr[d];
    int nc=c+dc[d];

    if(nr>=0&&nr<m&&nc>=0&&nc<n
    &&!visited[nr][nc]){
        visited[nr][nc]=true;

        q.offer(new int[]{nr,nc,steps+1});

      
    }

}
     
    }return dis;
}}