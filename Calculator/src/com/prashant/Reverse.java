package com.prashant;

public class Reverse {
    public static void main(String[] args) {
        int num=2359;
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans = ans*10 + rem;
            num/=10;
        }
        System.out.println(ans);
    }
}
