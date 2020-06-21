package asafov.com.ch1;

import java.util.Arrays;

public class MatrixZero {
    public int[][] setToZero(int[][] matrix){
        int[][] m = new int[matrix.length][matrix[0].length];
        for (int i= 0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                m[i][j]=matrix[i][j];
            }
        }
        for (int i= 0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]==0){
                    int x = 0;
                    while (x<matrix[i].length){
                        m[i][x++]=0;
                    }
                    x=0;
                    while (x<matrix.length){
                        m[x++][j]=0;
                    }
                }
            }
        }
        return m;
    }
}
