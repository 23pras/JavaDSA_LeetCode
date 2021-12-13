package com.prashant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {  

            case "mango":
                System.out.println("king of fruits");
                break;

            case "apple":
                System.out.println("sweet red fruit");
                break;

            case "orange":
                System.out.println("bitter fruit");
                break;

            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("enter a valid fruit");
        }
    }
}
