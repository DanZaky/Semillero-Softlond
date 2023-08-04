package com.exercises;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        double decimalNumber = ScannerDoubleNumber();
        int decimalQuantity = ScannerIntegerNumber();

        double roundedNumber = roundNumber(decimalNumber, decimalQuantity);

        System.out.println("El número " + decimalNumber + " redondeado a " + decimalQuantity + " decimales es: " + roundedNumber);

    }

    public static double roundNumber(double decimalNumber, int decimalQuantity) {
        double factor = Math.pow(10, decimalQuantity);
        return Math.round(decimalNumber * factor) / factor;
    }
    public static boolean IsDouble(String text) {
        double v;
        try {
            v=Double.parseDouble(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
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

    public static double ScannerDoubleNumber(){
        Scanner scanner = new Scanner(System.in);
        double number;
        String snumber;
        do{
            System.out.print("Ingrese el número décimal: ");
            snumber = scanner.nextLine();
        }while( !IsDouble(snumber) );
        number = Double.parseDouble(snumber);
        return number;
    }

    public static int ScannerIntegerNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        String snumber;
        do{
            System.out.print("Ingrese la cantidad de decimales que desea: ");
            snumber = scanner.nextLine();
        }while( !IsIntegerAndGreaterThanZero(snumber) );
        number = Integer.parseInt(snumber);
        return number;
    }
}
