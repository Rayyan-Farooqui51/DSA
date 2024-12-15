/* Q10. write a function in java to print following pattern
Note: Number of rows and columns shall be the input parameters to the function
Parallelogram 

    *****
   *****
  *****
 *****  
*****
*/

import java.util.Scanner;

public class Q10 {
  static void Parallelogram(int r, int c){
    for(int i=0 ; i<r ; i++){
      for(int j=c-i-1 ; j>0 ; j--){
        System.out.print(" ");
      }
      for(int j=0 ; j<c ; j++){
        System.out.print("*");
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
    Parallelogram(r,c);
    
  }  
}