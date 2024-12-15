/*13.	write a function in java to print following pattern
Note: Only odd number of rows will be the input parameter to the function. If the number of rows is even then print an error and return false else return true.
Diamond
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;

public class Q13 {
    static void Diamond(int r){
        for(int i=0; i<r; i++){
            for(int j=r-i-1; j>0 ;j--){
                System.out.print(" ");
            }
            for(int j=0 ; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r-2 ; i>=0 ; i--){
            for(int j=r-i-1 ; j>0 ; j--){
                System.out.print(" ");
            }
            for(int j=0 ; j<2*i+1 ; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        Diamond(r);
        sc.close();
        
    }
}
