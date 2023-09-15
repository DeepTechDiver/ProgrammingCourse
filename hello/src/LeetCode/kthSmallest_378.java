package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class kthSmallest_378 {
    public static void main(String[] args){
        kthSmallest_378 test = new kthSmallest_378();
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        test.kthSmallest(matrix, k);
    }

    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[] matrixs = new int[m*n];
        int a=0;
        while (a< m*n){
            for(int i=0; i< m;i++){
                for(int j=0; j<n; j++){
                    matrixs[a] = matrix[i][j];
                    a++;
                }
            }
        };
        for(int x =0;x < matrixs.length; x++){
            for (int y=0; y< m*n && y+1< m*n; y++){
                if (matrixs[y] > matrixs[y+1]){
                    int temp = matrixs[y];
                    matrixs[y] = matrixs[y+1];
                    matrixs[y+1] = temp;
                }
            }
        }
        return matrixs[k-1];

    }
}
