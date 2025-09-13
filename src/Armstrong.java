import java.util.Scanner;
public class Armstrong {
    // Using %   ( Optimal )
    private static boolean arm1(int n){        // Time: O(digits) or O(logn)   Space: O(1)
        int temp=n,sum=0,len=0;
        while(temp>0){       // len=(int)Math.log10(num)+1;
            len++;
            temp/=10;
        }
        temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+= (int) Math.pow(digit,len);
            temp/=10;
        }
        return sum==n;
    }
    // Using String conversion
    private static boolean arm2(int n){       // Time: O(digits) or O(logn)   Space: O(digits)
        String s=String.valueOf(n);
        int len=s.length();
        int sum=0;
        for(char c:s.toCharArray()){
            int digit=c-'0';
            sum+=(int)Math.pow(digit,len);
        }
        return sum==n;
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Armstrong check");
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        System.out.println(arm1(n));
        System.out.println(arm2(n));
    }
}
