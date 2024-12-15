/*12. write a function in java to print following pattern
Note: Only number of columns will be the input parameter to the function
Half diamond
*
**
***
****
*****
****
***
**
*
*/

import java.util.Scanner;

public class Q12 {
    static void HalfDiamond(int c){
        for (int i=0 ; i<c ; i++){
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0 ; i<c ; i++){
            for(int j=c-1-i ; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of column : ");
        int c = sc.nextInt();
        sc.close();
        HalfDiamond(c);
        
        
    }
}
