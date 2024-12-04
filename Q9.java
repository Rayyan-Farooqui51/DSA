// 9. Write a program to count total number of duplicate number in an array.
import java.util.Scanner;
public class Q9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE ;

        System.out.println("Enter Elements in array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }
        sc.close();

        int hash[] = new int[max+1];
        for(int i=0 ; i<n ; i++){
            if(hash[arr[i]]==0){
                hash[arr[i]] = 1;
            }
            else{
                hash[arr[i]]++;
            }
        }
        int count = 0 ;
        for (int i=0 ; i<max+1 ; i++){
            if(hash[i] > 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
    

