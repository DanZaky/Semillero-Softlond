package com.exercises;

import java.util.Scanner;

public class Excercise03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radio;
        String sradio;

        do{
            System.out.print("Ingrese el radio, debe ser mayor a 0: ");
            sradio = scanner.nextLine();
        }while( !IsDoubleAndGreaterThanZero(sradio));
        radio = Double.parseDouble(sradio);

        System.out.println("El área del circulo con radio " + radio + " es: " + (Math.PI*radio*radio));
        System.out.println("El perímetro del circulo con radio " + radio + " es: " + (2*Math.PI*radio));

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
}
