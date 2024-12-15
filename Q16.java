/*16. write a function in java to print following pattern 
Note: number of rows shall be the input parameter to the function.
12345
23455
34555
45555
55555
 */

import java.util.Scanner;

public class Q16 {
    static void pattern(int r){
        for(int i = 1 ; i <= r ; i++){
            for(int j = i ; j<=r ; j++){
                System.out.print(j);
            }
            for(int j = i ; j > 1 ; j--){
                System.out.print(r);
            }
            System.out.println();
        }       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        sc.close();
        pattern(r);
    }
}
