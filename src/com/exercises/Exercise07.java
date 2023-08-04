package com.exercises;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        String snumber1;

        do{
            System.out.print("Ingrese un número entero positivo: ");
            snumber1 = scanner.nextLine();
        }while( !IsIntegerAndGreaterThanZero(snumber1) );
        number1 = Integer.parseInt(snumber1);
        scanner.close();

        for (int i = 1; i<=10; i++){
            System.out.println(number1 + " * " + i + " = " + number1*i);
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
}
