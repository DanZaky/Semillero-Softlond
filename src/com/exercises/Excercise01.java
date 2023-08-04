package com.exercises;

import java.util.Scanner;

public class Excercise01 {
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

        System.out.println("Suma "+number1+" + "+number2+" = "+(number1+number2));
        System.out.println("Resta "+number1+" - "+number2+" = "+(number1-number2));
        System.out.println("Multiplicación "+number1+" * "+number2+" = "+(number1*number2));
        if(number2==0){
            System.out.println("No es posible dividir entre 0");
        }else{
            System.out.println("División "+number1+" / "+number2+" = "+(number1/number2));
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
