package com.prashant;

public class CountNums {
    public static void main(String[] args) {
        long n =13839383333L;
        int count=0;
        while (n>0) {
            int rem = (int) (n % 10);
            if (rem == 3) {
                count++;

            }
            n=n/10;
        }
        System.out.println(count);
    }
}
