// 4. Write a program that takes 7 integers as input from the user then Reverse the order of numbers in the array, then print the numbers.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,arr[] = new int[7];

        System.out.print("Enter element array : ");
        for(int i=0 ; i<7 ;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0 ; i<7/2 ; i++){
            t=arr[i];
            arr[i] = arr[7-i-1];
            arr[7-i-1] = t;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
