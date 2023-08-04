package com.exercises;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        int number = ScannerNumber();

        boolean isCousinPrime = true;

        if (number <= 1) {
            isCousinPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isCousinPrime = false;
                    break;
                }
            }
        }

        if (isCousinPrime) {
            System.out.println(number + " es un número primo.");
        } else {
            System.out.println(number + " no es un número primo.");
        }

    }

    public static boolean IsIntegerAndGreaterThanZero(String text) {
        int v;
        try {
            v=Integer.parseInt(text);
            return v > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static int ScannerNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        String snumber;
        do{
            System.out.print("Ingrese el número entero positivo: ");
            snumber = scanner.nextLine();
        }while( !IsIntegerAndGreaterThanZero(snumber) );
        number = Integer.parseInt(snumber);
        return number;
    }

}
