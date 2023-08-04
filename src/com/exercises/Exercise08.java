package com.exercises;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int random = (int)(Math.random()*100+1);
        int number1 = 0;
        String snumber1;
        boolean win = false;

        while(!win){
            System.out.print("Ingrese un número entero positivo: ");
            snumber1 = scanner.nextLine();
            if (IsIntegerAndGreaterThanZero(snumber1)){
                number1 = Integer.parseInt(snumber1);
                if (number1 == random) {
                    win = true;
                    System.out.println("¡Felicidades! Haz adivinado el número");
                } else if (number1 < random){
                    System.out.println("El número es mayor, Intenta de nuevo");
                } else if (number1 > random){
                    System.out.println("El número es menor, Intenta de nuevo");
                }

            }
            else
                System.out.println("El valor ingresado no fue un entero positivo");
        }
        scanner.close();
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
