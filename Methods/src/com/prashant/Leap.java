package com.prashant;

public class Leap {
    static int LeapYear(int year,int p){
//enter your code here
        p=0;
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0){
                    p=1;
                }

                else{
                    p=0;
                }
            }
            else
                p=1;
        }

        else {
            p=0;
        }


        return p;
    }
}

