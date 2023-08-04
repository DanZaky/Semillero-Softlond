package com.exercises;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1, factorial=1;
        String snumber1;

        do{
            System.out.print("Ingrese un número entero positivo: ");
            snumber1 = scanner.nextLine();
        }while( !IsIntegerAndGreaterThanZero(snumber1) );
        number1 = Integer.parseInt(snumber1);
        scanner.close();

        for (int i=2; i<=number1; i++){
            factorial *= i;
        }

        System.out.println(number1 + "! = " + factorial);
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
}
