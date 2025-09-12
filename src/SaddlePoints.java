import java.util.*;
public class SaddlePoints {      //Time: O(r*c) Space: O(r+c)
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        r=sc.nextInt();
        System.out.print("Enter no of columns: ");
        c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.print("Enter elements:\n");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=sc.nextInt();
        System.out.println("Matrix elements:");
        for(int[] i:mat){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int[] rowmax=new int[r];
        int[] colmin=new int[c];
        for(int i=0;i<r;i++) {
            int max = mat[i][0];
            for (int j = 1; j < c; j++) {
                if (mat[i][j] > max)
                    max = mat[i][j];
            }
            rowmax[i] = max;
        }
        for(int j=0;j<c;j++) {
            int min = mat[0][j];
            for (int i = 1; i < r; i++) {
                if (mat[i][j] < min)
                    min = mat[i][j];
            }
            colmin[j] = min;
        }
        System.out.println("Max in each row: "+Arrays.toString(rowmax));
        System.out.println("Min in each column: "+Arrays.toString(colmin));
        System.out.println("The saddle points of given matrix are as follows:");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
               if(mat[i][j]==rowmax[i] && mat[i][j]==colmin[j])
                   System.out.print("("+(i+1)+","+(j+1)+") ");
            }
        }
    }
}
