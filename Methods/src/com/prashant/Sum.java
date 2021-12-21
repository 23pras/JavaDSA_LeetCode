package com.prashant;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
           sum();          // method called
        int ans = sum2();
        System.out.print(ans);
    }

    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter first no: ");
        num1 = input.nextInt();
        System.out.print("Enter second no: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        return sum;   //return means function end here
    }
    static void sum(){                                         //method created with name sum
        Scanner input = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter first no: ");
        num1 = input.nextInt();
        System.out.print("Enter second no: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of two no :" + sum);
    }
}
