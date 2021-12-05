package com.prashant;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in C: ");
        float c= input.nextFloat();
        float f= (9/5*c)+32;
        System.out.println(f);
    }
}
