import java.util.*;
public class Anagram {
    // Using fixed array   ( Optimal )
    private static boolean checkAnagram1(String s1, String s2){    // Time: O(n)  Space: O(1)
        if(s1.length()!=s2.length())
            return false;
        int[] count=new int[26];
        for(char c:s1.toCharArray())
            count[c-'a']++;
        for(char c:s2.toCharArray()){
            count[c-'a']--;
            if(count[c-'a']<0)
                return false;
        }
        return true;
    }
    // Using HashMap
    private static boolean checkAnagram2(String s1, String s2){    // Time: O(n)  Space: O(k unique)
        if(s1.length()!=s2.length())
            return false;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s1.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(char c:s2.toCharArray()){
            if(!map.containsKey(c))
                return false;
            map.put(c,map.get(c)-1);
            if(map.get(c)==0)
                map.remove(c);
        }
        return map.isEmpty();
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Valid Anagram check");
        String s1,s2;
        System.out.print("Enter first word: ");
        s1=sc.next();
        System.out.print("Enter second word: ");
        s2=sc.next();
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        System.out.println(checkAnagram1(s1,s2));
        System.out.println(checkAnagram2(s1,s2));
    }
}
