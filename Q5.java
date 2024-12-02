//5.	Write a program that takes 5 integers as input from the user and finds out if the order of numbers in array is palindrome

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.print("Enter element array : ");
        for(int i=0 ; i<5 ;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean flag = true;
        int length = arr.length;
        for(int i=0 ; i<length/2 ; i++){
           if(arr[i]!=arr[length-i-1]){
                flag = false;
           }
        }
        if(flag==true){
            System.out.println("Yes, order of element in array is in palindrome");
        }
        else{
            System.out.println("No, order of element in array is not in palindrome");
        }
    }
}
