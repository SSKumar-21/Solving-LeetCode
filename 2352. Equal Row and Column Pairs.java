class Solution {
    public int equalPairs(int[][] grid) {
        int c=0;
        boolean check=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                for(int k=0;k<grid.length;k++){
                    check=true;
                    if(grid[k][i]!=grid[j][k]){
                        check=false;
                        break;
                    }
                }
                if(check){
                    c++;
                }
            }
        }
        return c;
    }
}
/*
int equalPairs(int** grid, int gridSize, int* gridColSize) {
    int c=0;
        bool check=false;
        for(int i=0;i<gridSize;i++){
            for(int j=0;j<gridSize;j++){
                for(int k=0;k<gridSize;k++){
                    check=true;
                    if(grid[k][i]!=grid[j][k]){
                        check=false;
                        break;
                    }
                }
                if(check){
                    c++;
                }
            }
        }
        return c;
}
*/
