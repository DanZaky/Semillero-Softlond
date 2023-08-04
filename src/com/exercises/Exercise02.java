package com.exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        String snumber;

        do{
            System.out.print("Ingrese el número entero: ");
            snumber = scanner.nextLine();
        }while( !IsInteger(snumber) );
        number = Integer.parseInt(snumber);

        if(number%2==0)
            System.out.println("El número "+number+" es par");
        else
            System.out.println("El número "+number+" es impar");

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
