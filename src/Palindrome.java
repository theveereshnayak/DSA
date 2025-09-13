import java.util.*;
public class Palindrome {
    // Using two pointer   ( Optimal )
    private static boolean checkPalindrome1(String s){   // Time: O(n)  Space: O(1)
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    // Using StringBuilder built-in func
    private static boolean checkPalindrome2(String s){   // Time: O(n)  Space: O(n)
        return s.contentEquals(new StringBuilder(s).reverse());
    }
    // Using Stack
    private static boolean checkPalindrome3(String s){   // Time: O(n)  Space: O(n)
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
            stack.push(c);
        for(char c:s.toCharArray())
            if(c!=stack.pop())
                return false;
        return true;
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Palindrome check");
        System.out.print("Enter word: ");
        s=sc.next().toLowerCase();
        System.out.println(checkPalindrome1(s));
        System.out.println(checkPalindrome2(s));
        System.out.println(checkPalindrome3(s));
    }
}

