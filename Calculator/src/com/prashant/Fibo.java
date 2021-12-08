package com.prashant;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.print("Enter the nth fibo number you want: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b=b+a;
            a = temp;
            count++;
        }
        System.out.println("So the 10th number is: "+ b);
    }
}

