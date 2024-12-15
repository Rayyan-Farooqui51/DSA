/*14.	write a function in java to print following pattern 
Note: Number of rows and columns shall be the input parameters to the function
12345
54321
12345
54321
12345

 */

import java.util.Scanner;

public class Q14 {
    static void pattern(int r, int c){
        for(int i=0 ; i<r ; i++){
            if(i%2==0){
                for(int j=0 ; j<c ; j++){
                    System.out.print(j+1);
                }
                System.out.println();
            }
            else{
                for(int j=c ; j>0 ; j--){
                    System.out.print(j);
                }
                System.out.println();
            }
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