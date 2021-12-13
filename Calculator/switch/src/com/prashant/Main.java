package com.prashant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        //String fruit = in.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");   // alt + shift + enter
//            case "apple" -> System.out.println("sweet red fruit");  // for cleaner code
//            case "orange" -> System.out.println("bitter fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("enter a valid fruit");
//        }
        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("monday");          //new clean way
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//            default -> System.out.println("enter valid no");
//        }

//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
//            case 6, 7 -> System.out.println("weekend");
//            default -> System.out.println("enter valid no");
//        }
                                          // both code works same
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("enter valid no");
                break;
        }

    }
}
