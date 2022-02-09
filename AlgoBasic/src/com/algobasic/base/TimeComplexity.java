package com.algobasic.base;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class TimeComplexity {
    public static void main(String [] args){

        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(sumFromFormula(1000000000));
        LocalDateTime l2 = LocalDateTime.now();
        System.out.println(sumFromForLoop(1000000000));
        LocalDateTime l3 = LocalDateTime.now();
        System.out.println(Duration.between(l1,l2).toMillis());
        System.out.println(Duration.between(l2,l3).toMillis());
    }

    public static int sumFromFormula(int number){
        return (number*(number+1))/2;
    }

    public static int sumFromForLoop(int number){

        int sum =0;
        for(int i=1; i<=number; i++){

            sum+=i;
        }
        return sum;
    }
}
