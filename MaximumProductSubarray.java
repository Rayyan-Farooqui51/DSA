/*Input: arr[] = {-2, 6, -3, -10, 0, 2}
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180 */
import java.util.*;
public class MaximumProductSubarray {
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
        int leftToRight = 1, rightToLeft = 1, maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (leftToRight == 0) leftToRight = 1;
            if (rightToLeft == 0) rightToLeft = 1;

            leftToRight *= list.get(i);

            rightToLeft *= list.get(n-i-1);

            if(maxProd < leftToRight){
                maxProd = leftToRight;
            }
            if(maxProd < rightToLeft){
                maxProd = rightToLeft;
            }

        }
        System.out.println("Maximum Product is : "+maxProd);
    }
    
}
