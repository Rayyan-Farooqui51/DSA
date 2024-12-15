/*11. write a function in java to print following pattern
Note: Only number of rows shall be the input parameter to the function
Right triangle
*
**
***
****
*****
*/

import java.util.Scanner;

public class Q11 {
    static void RightTriangle(int r){
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        sc.close();
        RightTriangle(r);

        
    }
}
