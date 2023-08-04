package com.exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        double side1 = ScannerNumber("1");
        double side2 = ScannerNumber("2");
        double side3 = ScannerNumber("3");

        double semiperimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));

        System.out.println("El área del triángulo es: " + area);


    }

    public static boolean IsDoubleAndGreaterThanZero(String text) {
        double v;
        try {
            v=Double.parseDouble(text);
            return v > 0;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static double ScannerNumber(String text){
        Scanner scanner = new Scanner(System.in);
        double number1;
        String snumber1;
        do{
            System.out.print("Ingrese el lado " + text + ": ");
            snumber1 = scanner.nextLine();
        }while( !IsDoubleAndGreaterThanZero(snumber1) );
        number1 = Double.parseDouble(snumber1);
        return number1;

    }
}
