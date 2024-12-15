/*Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11. */

import java.util.*;

public class PrintSubarrayWithMaximumSum {
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
        
        int sum = list.get(0),maxsum = list.get(0);
        int start = 0, end = 0, currstart = 0; 

        for (int i = 1; i < n; i++){
            if(sum + list.get(i) > list.get(i)){
                sum += list.get(i);   
            }
            else{
                sum = list.get(i);
                currstart = i;
            }
            if(sum > maxsum){
                maxsum = sum;
                start = currstart;
                end = i;
            }
        }
        for(int i = start ; i<=end ; i++){
            if(i != end)
            System.out.print(list.get(i)+", ");
            else
            System.out.print(list.get(i));
        }
    }
}