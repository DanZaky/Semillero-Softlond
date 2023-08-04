package com.exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        int n = 20;
        System.out.print("Los primeros " + n + " números de la serie Fibonacci son: ");

        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
