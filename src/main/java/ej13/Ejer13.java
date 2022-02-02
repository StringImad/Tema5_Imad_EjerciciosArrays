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
        int valorIntroducido;

        do {
            do {
                System.out.println("Introduce el valor: ");
                valorIntroducido = teclado.nextInt();
            } while (valorIntroducido < 0 || valorIntroducido > 20);
            if (valorIntroducido != 0) {
                arrayHistograma[valorIntroducido - 1]++;
            }

        } while (valorIntroducido != 0);

        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ": ");
            String asteriscos = "";
            for (int j = 0; j < arrayHistograma[i]; j++) {
                asteriscos = asteriscos + "*";
            }
            System.out.print(asteriscos + "\n");
        }
    }
}
