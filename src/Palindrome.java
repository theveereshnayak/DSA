import java.util.*;
public class Palindrome {
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

    private static boolean checkPalindrome1(String s){   //O(n) time, O(1) space
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    private static boolean checkPalindrome2(String s){  // O(n) time, O(n) space
        return s.contentEquals(new StringBuilder(s).reverse());
    }

    private static boolean checkPalindrome3(String s){  // O(n) time, O(n) space
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
            stack.push(c);
        for(char c:s.toCharArray())
            if(c!=stack.pop())
                return false;
        return true;
    }
}

