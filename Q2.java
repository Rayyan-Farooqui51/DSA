// 2. Write a program that takes 5 integers as input from the user and print Max of all the numbers

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");
        int a,b,c,d,e;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a>b){
            // no operation
        }
        else{
            a = b;
        }
        c = sc.nextInt();
        if(c>a){
            a = c;
        }
        d = sc.nextInt();
        if(d>a){
            a = d;
        }
        e = sc.nextInt();
        if (e>a) {
            a = e;
        }
        sc.close();
        System.out.println("Max of all the numbers : "+a);
    }
}
