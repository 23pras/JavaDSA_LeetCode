package com.prashant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
