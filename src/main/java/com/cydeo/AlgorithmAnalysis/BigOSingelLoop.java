package com.cydeo.AlgorithmAnalysis;

public class BigOSingelLoop {
    public static void main(String[] args) {

        long numberOfOperations = 0;

        int n = 10000; //size of Data
        int m = 500;

        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);

        //Task 1 Single Loop...................
        /**
         * ------O(n)------*****************************************************
         */

        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("numberOfOperations = " + numberOfOperations);
        System.out.println(endTime - startTime + " miliseconds");

        //Task 2 Nested Loop............

        System.out.println("------------------------------------");
        /**
         * ---------O(n2)-------------*********************************************
         */
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {
                numberOfOperations += 1;

            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("numberOfOperations with nested loop = " + numberOfOperations);
        System.out.println(endTime - startTime + " miliseconds");

        System.out.println("------------------------------------");
        //Task 3 Three Nested Loops
        /**
         * ---------O(n3)-----------------*************************************
         */
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations += 1;
                }
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("numberOfOperations with Three Nested loop = " + numberOfOperations);
        System.out.println(endTime - startTime + " miliseconds");


        //Task 5 Logarithmic Complexity
        System.out.println("------------------------------------");
        /**
         * ------O(logn)------************************************************
         */
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i *= 2) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("numberOfOperations with logarithmic = " + numberOfOperations);
        System.out.println(endTime - startTime + " miliseconds");

        System.out.println("------------------------------------");
        //Task 4 N and M Nested Loops
        /**
         * --------------------O(n*m)--------------****************************
         */
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                numberOfOperations += 1;

            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("numberOfOperations with N * M nested loop = " + numberOfOperations);
        System.out.println(endTime - startTime + " miliseconds");

        System.out.println("------------------------------------");
        //Task 6 N and M Consecutive Loops
        /**
         * --------------------O(n+m)--------------****************************
         */
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < m; i++) {
            numberOfOperations += 1;
        }
        for (int i = 0; i < m; i++) {
            numberOfOperations += 1;
        }

        endTime = System.currentTimeMillis();

        System.out.println("numberOfOperations with N + M nested loop = " + numberOfOperations);
        System.out.println(endTime - startTime + " miliseconds");


    }
}
