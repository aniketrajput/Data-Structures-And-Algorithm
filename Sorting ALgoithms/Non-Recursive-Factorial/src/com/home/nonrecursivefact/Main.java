package com.home.nonrecursivefact;

public class Main {

    public static void main(String[] args) {

        System.out.println(nonRecursiveFact(8));
        System.out.println(recusiveFact(4));
    }

    public static int nonRecursiveFact(int num){

        int fact = 1;

        while (num > 0) {
            fact = fact * num;
            num--;
        }

        return fact;
    }

    /*
         1! = 1                  = 1 * 0!
         2! = 2 * 1              = 2 * 1!
         3! = 3 * 2 * 1          = 3 * 2!
         4! = 4 * 3 * 2 * 1      = 4 * 3!
        n!                       = n *(n - 1)!

    */

    public static int recusiveFact(int num){

        if(num == 0)
            return 1;

        return num * recusiveFact(num-1);
    }

    /*
        recusiveFact(0)                 1
        1 * recusiveFact(0)             1 * 1 = 1
        2 * recusiveFact(1)             2 * 1 = 2
        3 * recusiveFact(2)             3 * 2 = 6
        4 * recusiveFact(3)             4 * 6 = 24
        recusiveFact(4)                 24
    */
}
