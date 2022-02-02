/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ejer13 {

    public static void main(String[] args) {
        int[] arrayHistograma = new int[20];
        Scanner teclado = new Scanner(System.in);
        int datoIntroducido;
        boolean repetir = true;
        for (int i = 0; i < 20; i++) {
            do {
                System.out.println("Introduce el valor de la posicion " + (i + 1));
                datoIntroducido = teclado.nextInt();
                if ((datoIntroducido < 20 && datoIntroducido > 0)) {
                    repetir = false;
                }
            } while (repetir);
            if (datoIntroducido == 0) {
                break;
            }
            arrayHistograma[i] = datoIntroducido;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ": ");
            String asterisco = "";
            for (int j = 0; j < arrayHistograma[i]; j++) {
                asterisco = asterisco + "*";
            }
            System.out.print(asterisco + "\n");
        }
    }
}
