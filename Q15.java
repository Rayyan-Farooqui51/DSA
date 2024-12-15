/*15.	write a function in java to print following pattern 
Note: Number of rows and columns shall be the input parameters to the function
11111
10001
10001
10001
11111
 */

import java.util.Scanner;

public class Q15 {
   static void pattern(int r, int c){
    for(int i=0 ; i<r ; i++){
        for(int j=0 ; j<c ; j++){
        if(i==0 || i==r-1 || j==0 || j==c-1){
           System.out.print("1");
            }
        else{
            System.out.print("0");
            }
        }
        System.out.println();
    }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of column : ");
        int c = sc.nextInt();
        sc.close();
        pattern(r, c);
    }
}
