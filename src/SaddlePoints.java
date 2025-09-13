import java.util.*;
public class SaddlePoints {
    // Using rowMax and colMin
    public static void findSaddlePoints(int[][] mat, int r, int c) {    // Time: O(r*c)  Space: O(r+c)
        int[] rowmax = new int[r];
        int[] colmin = new int[c];
        // Find row-wise maximum
        for (int i = 0; i < r; i++) {
            int max = mat[i][0];
            for (int j = 1; j < c; j++) {
                if (mat[i][j] > max)
                    max = mat[i][j];
            }
            rowmax[i] = max;
        }
        // Find column-wise minimum
        for (int j = 0; j < c; j++) {
            int min = mat[0][j];
            for (int i = 1; i < r; i++) {
                if (mat[i][j] < min)
                    min = mat[i][j];
            }
            colmin[j] = min;
        }
        // Print saddle points
        System.out.println("The saddle points of given matrix are:");
        boolean found = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == rowmax[i] && mat[i][j] == colmin[j]) {
                    System.out.print("(" + (i + 1) + "," + (j + 1) + ") ");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No saddle points found.");
        }
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix elements:");
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        // Call function
        findSaddlePoints(mat, r, c);
    }
}
