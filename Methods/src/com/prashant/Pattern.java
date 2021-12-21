package com.prashant;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the pattern size n :");
        int n = input.nextInt();
//enter your code here

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=i){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        //System.out.println();
    }
}
