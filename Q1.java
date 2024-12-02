// 1. Write a program to count total number of negative numbers in an array.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count=0;
        for (int i : arr) {
            if (i<0){
                count++;
            }
        }
        System.out.println(count);

    }
}