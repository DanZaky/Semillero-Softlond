package com.exercises;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        String snumber1;

        do{
            System.out.print("Ingrese el número entero: ");
            snumber1 = scanner.nextLine();
        }while( !IsInteger(snumber1) );
        number1 = Integer.parseInt(snumber1);

        if(number1 > 0)
            System.out.println(number1 + " es positivo");
        else if (number1 < 0)
            System.out.println(number1 + " es negativo");
        else
            System.out.println(number1 + " es cero");



    }

    public static boolean IsInteger(String text) {
        int v;
        try {
            v=Integer.parseInt(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
