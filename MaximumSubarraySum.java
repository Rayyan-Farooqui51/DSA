/*Given an integer array nums, find the
subarray with the largest sum, and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6. */

import java.util.*;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter element in array : ");
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        sc.close();
        int sum = 0,maxsum = 0;
        for (int i = 0; i < n; i++){
            if(sum + list.get(i) > list.get(i)){
                sum += list.get(i);
            }
            else{
                sum = list.get(i);
            }
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        System.out.println("Maximum sum is : "+maxsum);
    }
}