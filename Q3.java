// 3. Write a program to merge two sorted arrays to a third array.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;

        System.out.print("Enter size of first array : ");
        n = sc.nextInt();

        System.out.print("Enter size of first array : ");
        m = sc.nextInt();

        System.out.print("Enter order of input array : ascending/descending ");
        String s = sc.next();
        boolean d = false;

        if(s.equals("descending")){
            d = true; 
        }

        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int arr3[] = new int[n+m];

        System.out.print("Enter element in first array : ");
        for(int i=0 ; i<n ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter element in second array : ");
        for(int i=0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();
        int i = 0, j = 0;
        if(d==true){
            while(i<n && j<m){
                if(arr1[i] >= arr2[j]){
                    arr3[i+j] = arr1[i];
                    i++;
                }
                else{
                    arr3[i+j] = arr2[j];
                    j++;
                }
            }

            for(int k=i ; k < n ; k++){
                arr3[k+j] = arr1[k]; 
            }
            for(int k=j ; k < m ; k++){
                arr3[k+i] = arr2[k]; 
            }
        }
        else{
            while(i<n && j<m){
                if(arr1[i] <= arr2[j]){
                    arr3[i+j] = arr1[i];
                    i++;
                }
                else{
                    arr3[i+j] = arr2[j];
                    j++;
                }
            }

            for(int k=i ; k < n ; k++){
                arr3[k+j] = arr1[k]; 
            }
            for(int k=j ; k < m ; k++){
                arr3[k+i] = arr2[k]; 
            }
        }
        for(int k=0 ; k < n+m ; k++){
            System.out.print(arr3[k]);
        }
    }
}
