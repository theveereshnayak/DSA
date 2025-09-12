import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Reverse String");
        System.out.print("Enter word: ");
        s=sc.next();
        System.out.println(revStr1(s));
        System.out.println(revStr2(s));
        System.out.println(revStr3(s));
    }

    private static String revStr1(String s){      //time:O(n)  space:O(n)
        return new StringBuilder(s).reverse().toString();
    }

    private static String revStr2(String s){      //time:O(n)  space:O(n)
        char[] c=s.toCharArray();
        int left=0,right=c.length-1;
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        return new String(c);
    }

    private static String revStr3(String s){       //time:O(n)  space:O(n)
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
            stack.push(c);
        StringBuilder rev=new StringBuilder();
        while (!stack.isEmpty())
            rev.append(stack.pop());
        return rev.toString();
    }

}
