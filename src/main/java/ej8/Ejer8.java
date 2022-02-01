/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ejer8 {

    public static void main(String[] args) {
        int[] array;
        int numero;
        // final char ASTERISCO = 42;//42
        numero = ComprobadorIntroduccionInt();
        array = new int[numero];

        for (int i : array) {
            i = ComprobadorIntroduccionInt();
        }
        int contador = 0;
        
        for (int i = 0; i < array.length; i++) {
            contador = 0;

            do {
                for (int j : array) {

                    System.out.print("*");
                    

                }
            } while (contador == array[i]);
            System.out.println("\n");
        }

    }

    private static int ComprobadorIntroduccionInt() {
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido = 0;
        boolean repeticion = false;
        do {
            try {
                System.out.println("Introduce un numero");
                numeroIntroducido = teclado.nextInt();
                repeticion = false;
            } catch (InputMismatchException ime) {
                repeticion = true;
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                teclado.nextLine();
            }
        } while (repeticion);
        return numeroIntroducido;

    }
}
