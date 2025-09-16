import java.util.*;
public class SpiralMatrix {
    // Using left,right,top,bottom approach
    private static int[] spiral(int[][] mat){    // Time: O(r*c)  Space: O(r*c)
        if(mat==null || mat.length==0)
            return new int[0];
        int r=mat.length;
        int c=mat[0].length;
        int[] res=new int[r*c];
        int index=0;
        int top=0,bottom=r-1;
        int left=0,right=c-1;
        while (top<=bottom && left<=right){
            // Top row
            for(int j=left;j<=right;j++)
                res[index++]=mat[top][j];
            top++;
            // Right col
            for(int i=top;i<=bottom;i++)
                res[index++]=mat[i][right];
            right--;
            // Bottom row
            if(top<=bottom) {
                for (int j = right; j >= left; j--)
                    res[index++] = mat[bottom][j];
                bottom--;
            }
            // Left col
            if(left<=right) {
                for (int i = bottom; i >= top; i--)
                    res[index++] = mat[i][left];
                left++;
            }
        }
        return res;
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Spiral Matrix:");
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
        System.out.println("Elements in Spiral order");
        System.out.println(Arrays.toString(spiral(mat)));
    }
}
