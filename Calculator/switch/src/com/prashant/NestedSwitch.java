package com.prashant;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();
                                                      // cleaner code
//        switch (empId) {
//            case 1 -> System.out.println("Prashant Pal");
//            case 2 -> System.out.println("PP");
//            case 3 -> {
//                System.out.println("Emp no 3");
//                switch (department) {
//                    case "IT" -> System.out.println("IT department");
//                    case "Non-IT" -> System.out.println("Non IT department");
//                    default -> System.out.println("non department entered");
//                }
//            }
//            default -> System.out.println("Enter correct ID");
//        }

        switch (empId){
            case 1:
                System.out.println("Prashant Pal");
                break;
            case 2:
                System.out.println("PP");
                break;
            case 3:
                System.out.println("Emp no 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Non-IT":
                        System.out.println("Non IT department");
                        break;
                    default:
                        System.out.println("non department entered");
                }break;
            default:
                System.out.println("Enter correct ID");
        }
    }
}
