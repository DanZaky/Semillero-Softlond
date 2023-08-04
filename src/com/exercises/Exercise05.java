package com.exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1, number2;
        String snumber1, snumber2;

        do{
            System.out.print("Ingrese el primer número entero: ");
            snumber1 = scanner.nextLine();
        }while( !IsInteger(snumber1) );
        number1 = Integer.parseInt(snumber1);

        do{
            System.out.print("Ingrese el segundo número entero: ");
            snumber2 = scanner.nextLine();
        }while( !IsInteger(snumber2) );
        number2 = Integer.parseInt(snumber2);


        if(number1>number2){
            System.out.println(number1 +" es mayor que "+ number2);
        } else if (number2>number1) {
            System.out.println(number2 +" es mayor que "+ number1);
        }else {
            System.out.println(number1 + " y " + number2 + " son iguales." );
        }


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
