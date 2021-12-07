package com.prashant;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        char ch = input.next().trim().charAt(0);     //trim is to remove space from string.

        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("UPPERCASE");
        }

        //System.out.println(ch);
    }
}
