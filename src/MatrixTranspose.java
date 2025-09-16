import java.util.*;
public class MatrixTranspose {
    // Using Inplace swap for Square matrix
    private static int[][] tranSquare(int[][] mat){     // Time: O(n^2)  Space: O(1)
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        return mat;
    }
    // Using Extra matrix
    private static int[][] transMat(int[][] mat){     // Time: O(r*c)  Space: O(m*n)
        int r=mat.length;
        int c=mat[0].length;
        int[][] res=new int[c][r];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                res[j][i]=mat[i][j];
        return res;
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Matrix Transpose:");
        System.out.print("Enter no of rows: ");
        r = sc.nextInt();
        System.out.print("Enter no of cols: ");
        c = sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter elements of matrix");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=sc.nextInt();
        System.out.println("Matrix:\n"+Arrays.deepToString(mat));
        System.out.println("Resultant Matrix");
        if(r==c)  // Square
            System.out.println(Arrays.deepToString(tranSquare(mat)));
        else
            System.out.println(Arrays.deepToString(transMat(mat)));
    }
}
