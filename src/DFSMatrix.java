public class DFSMatrix {
  public int[][] dirs = {{0,1}, {1,0}, {0, -1}, {-1, 0}};

  public int numIslands(char[][] grid){
      if(grid.length==0||grid[0].length==0){
          return 0;
      }
      boolean[][] visited = new boolean[grid.length][grid[0].length];
      int count = 0;
      for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
              if(!visited[i][j] && grid[i][j]=='1'){
                  dfs(i,j,grid,visited);
                  count++;
              }
          }
      }
      return count;
  }
  private void dfs(int i, int j, char[][] grid, boolean[][] visited){

  if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') { return; }
      visited[i][j] = true;
      dfs(i,j-1,grid,visited);
      dfs(i,j+1,grid,visited);
      dfs(i-1,j,grid,visited);
      dfs(i+1,j,grid,visited);
  }

  public int BFSIsland(char[][] grid) {
    if(grid.length==0||grid[0].length==0){
        return 0;
    }
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int count = 0;
    for(int i=0;i<grid.length;i++){
      for(int j=0;j<grid[0].length;j++){
        if (!visited[i][j] & grid[i][j] == '1') {
          // do bfs only if its a 1 and then start marking adjacent islands as visited
          bfs(i,j,grid,visited);
          count++;
        }

      }
    }
  }

  public void bfs(int i,int j,char[][] grid, boolean[][] visited) {
    Queue<int[]> queue = new LinkedList<int[]>();
    queue.offer(new int{i,j});
    visited[i][j] = true;
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      for (int[] dir : dirs) {
        int x = curr[0] + dir[0];
        int y = curr[1] + dir[1];
        if (x < 0 || x > grid.length || y < 0 || y > grid[0].length || visited[x][y] || grid[x][y] == '0') { continue;}
        visited[x][y] = true;
        queue.offer(new int[] {x,y});
      }
    }
  }


}
