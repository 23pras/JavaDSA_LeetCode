package com.prashant;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      //here input is just used for taking input, we can use any word here
        int num1= input.nextInt();
        int num2= input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of 2 no are " + sum);
    }
}
