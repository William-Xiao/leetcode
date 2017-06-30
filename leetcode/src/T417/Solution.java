package T417;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int[][] matrix;
    int[][] markPacific;
    int[][] markAtlantic;
    int n;
    int m;

    public List<int[]> pacificAtlantic(int[][] matrix) {
        this.matrix = matrix;
        if(this.matrix == null){
            return new ArrayList<int[]>();
        }

        if(matrix.length == 0){
            return new ArrayList<int[]>();
        }

        n = matrix.length;
        m = matrix[0].length;
        markPacific = new int[n][m];
        markAtlantic = new int[n][m];

        for(int i=0; i < n; i++){
            isToPacific(i, 0, 0);
            isToAtlantic(i, m-1, 0);
        }

        for(int i=0; i < m; i++){
            isToPacific(0, i, 0);
            isToAtlantic(n-1, i, 0);
        }

        return merge();
    }

    private void isToPacific(int x, int y, int max){
        if(x >=0 && x < n && y >= 0 && y < m && matrix[x][y] >= max && markPacific[x][y] == 0){
            markPacific[x][y] = 1;
            isToPacific(x-1, y, matrix[x][y]);
            isToPacific(x, y - 1, matrix[x][y]);
            isToPacific(x + 1, y, matrix[x][y]);
            isToPacific(x, y + 1, matrix[x][y]);
        }
    }

    private void isToAtlantic(int x, int y, int max){
        if(x >= 0 && x < n && y >= 0 && y < m && matrix[x][y] >= max && markAtlantic[x][y] == 0) {
            markAtlantic[x][y] = 1;
            isToAtlantic(x - 1, y, matrix[x][y]);
            isToAtlantic(x, y - 1, matrix[x][y]);
            isToAtlantic(x + 1, y, matrix[x][y]);
            isToAtlantic(x, y + 1, matrix[x][y]);
        }
    }

    private List<int[]> merge(){

        List<int[]> result = new ArrayList<int[]>();

        for(int i=0; i < n;i++){
            for(int j=0; j < m; j++){
                if(markPacific[i][j] == 1 && markAtlantic[i][j] ==1){
                    int[] a = {i,j};
                    result.add(a);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,2,3,5}, {3,2,3,4,4}, {2,4,5,3,1}, {6, 7,  1 ,4, 5}, {5,  1 ,  1 ,  2,   4}};
//        int[][] matrix = {{1,2,3},{8,9,4},{7,6,5}};
        Solution solution = new Solution();
        System.out.println(solution.pacificAtlantic(matrix));
    }
}