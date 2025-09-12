import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Reverse Number");
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        System.out.println(revNum1(n));
        System.out.println(revNum2(n));
        System.out.println(revNum3(n));
    }
    private static int revNum1(int n){    //time: O(digits) or O(logn)   space: O(1)
        int temp=n,rev=0;
        while(temp>0){
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        return rev;
    }

    private static int revNum2(int n){         //time: O(digits) or O(logn)   space: O(d)
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }

    private static int revNum3(int n){       //time: O(digits) or O(logn)   space: O(d)
        Stack<Integer> stack=new Stack<>();
        while(n>0){
            stack.push(n%10);
            n/=10;
        }
        int rev=0,i=1;
        while(!stack.isEmpty()) {
            rev = rev + stack.pop() * i;
            i = i * 10;
        }
        return rev;
    }
}


