class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

Queue<int[]>q=new LinkedList<>();

for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(i==0||j==0||i==m-1||j==n-1){
            if(grid[i][j]==1){
                q.offer(new int[]{i,j});
                grid[i][j]=0;
            }
        }
    }
}
         int[]dr={-1,1,0,0};
       int[]dc={0,0,-1,1};

    while(!q.isEmpty()){
      
        
            int []curr=q.poll();
            int r=curr[0];
            int c=curr[1];

            //check 4 directions
for(int d=0;d<4;d++)
{
    int nr=r+dr[d];
    int nc=c+dc[d];

    if(nr>=0&&nr<m&&nc>=0&&nc<n&&grid[nr][nc]==1){
        grid[nr][nc]=0;
        q.offer(new int[]{nr,nc});
    }

    }
    
    }
    int count=0;
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(grid[i][j]==1){
            count++;
        }
    }
}
return count;



    }
}