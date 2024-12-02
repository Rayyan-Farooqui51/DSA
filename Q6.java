/* 6. Write a program to search a number (taken as input from user) in an array 
then print the index of the first occurrence of the input number in the array
If the input number is not present in the array then print -1 */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = false;

        System.out.println("Enter Elements in array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to find : ");
        int i,x = sc.nextInt();
        sc.close();

        for (i=0 ; i<n ; i++){
            if(arr[i] == x){
                flag = true;
                break;
            }
        }

        if(flag==true){
            System.out.println("Element found at index "+i);
        }
        else{
            System.out.println("-1");
        }     
    }
}
