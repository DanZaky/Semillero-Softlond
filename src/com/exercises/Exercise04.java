package com.exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        String sage;

        do{
            System.out.print("Ingrese su edad: ");
            sage = scanner.nextLine();
        }while( !IsInteger(sage) );
        age = Integer.parseInt(sage);

        if(age>=18)
            System.out.println("Usted es mayor de edad");
        else
            System.out.println("Usted es menor de edad");

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
