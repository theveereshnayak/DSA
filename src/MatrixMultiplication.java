import java.util.*;
public class MatrixMultiplication {
    // Using triple loop (i,j,k)
    private static int[][] mul(int[][] a,int[][] b){    // Time: O(n^3)  Space: O(n^2)
        int r=a.length,c=b[0].length;
        int com=a[0].length;  // Also com=b.length as a's col = b's row
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<com;k++)
                    res[i][j]+=(a[i][k]*b[k][j]);
        return res;
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Matrix Multiplication of Two Matrices:");
        while(true) {
            System.out.println("Enter rows and columns of first matrix and second matrix");
            System.out.print("row1 col1 row2 col2: ");
            r1 = sc.nextInt();
            c1 = sc.nextInt();
            r2 = sc.nextInt();
            c2 = sc.nextInt();
            if (c1 != r2) {
                System.out.println("!!! Try again as col1 should be equal to row2 !!! ");
            }
            else
                break;
        }
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        System.out.println("Enter elements of first matrix");
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                a[i][j]=sc.nextInt();
        System.out.println("Enter elements of second matrix");
        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                b[i][j]=sc.nextInt();
        System.out.println("First Mat:\n"+Arrays.deepToString(a));
        System.out.println("Second Mat:\n"+Arrays.deepToString(b));
        System.out.println("Resultant Matrix");
        System.out.println(Arrays.deepToString(mul(a,b)));
    }
}
