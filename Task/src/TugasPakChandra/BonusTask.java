package TugasPakChandra;
//Tugas 3
import java.util.Arrays;

public class BonusTask {

    public static void main(String[] args) {
        int m = 5; 
        int n = 8; 

        int[][] matriks = new int[m][n]; 
        int nilai = 1; 

        for (int j = 0; j < n; j++) {
            matriks[0][j] = 1;
            matriks[m - 1][j] = 1;
        }
        for (int i = 0; i < m; i++) {
            matriks[i][0] = 1;
            matriks[i][n - 1] = 1;
        }
        for (int j = 1; j < n - 1; j++) {
            matriks[1][j] = 2;
            matriks[m - 2][j] = 2;
        }
        for (int i = 1; i < m - 1; i++) {
            matriks[i][1] = 2;
            matriks[i][n - 2] = 2;
        }
        for (int j = 2; j < n - 2; j++) {
            matriks[2][j] = 3;
            matriks[m - 3][j] = 3;
        }
        for (int i = 2; i < m - 2; i++) {
            matriks[i][2] = 3;
            matriks[i][n - 3] = 3;
        }
        for (int j = 3; j < n - 3; j++) {
            matriks[3][j] = 4;
            matriks[m - 4][j] = 4;
        }
        for (int i = 3; i < m - 3; i++) {
            matriks[i][3] = 4;
            matriks[i][n - 4] = 4;
        }
        for (int i = 4; i < m - 4; i++) {
            for (int j = 4; j < n - 4; j++) {
                matriks[i][j] = nilai;
                nilai++; 
            }
        }
        for (int i = 0; i < m; i++) {
        System.out.println(Arrays.toString(matriks[i]));
        }
    }
}
