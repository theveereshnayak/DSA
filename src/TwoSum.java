import java.util.*;
public class TwoSum {
    // Using HashMap   ( Optimal )
    private static int[] twoSum1(int[] nums, int target) {     // Time: O(n)  Space: O(n)
        Map<Integer,Integer> nmap=new HashMap<>();  //number->index
        int n=nums.length;
        for(int i=0;i<n;i++){
            int req=target-nums[i];
            if(nmap.containsKey(req)){
                return new int[] {nmap.get(req),i}; //indices of required nums
            }
            nmap.put(nums[i],i);
        }
        return new int[] {};  //if none
    }
    // Using BruteForce - 2 loops
    private static int[] twoSum2(int[] nums,int target){       // Time: O(n^2)  Space: O(1)
        for(int i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
        return new int[] {};
    }
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Two sum target");
        System.out.print("Enter no of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter target value: ");
        int tar=sc.nextInt();
        System.out.println(Arrays.toString(twoSum1(arr,tar))); // Print indices
        System.out.println(Arrays.toString(twoSum2(arr,tar)));
    }
}
