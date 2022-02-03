/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Ejer17 {

    public static void main(String[] args) {
        //declaracion de variables
        String stringLeido;
        String leidoMinus;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un string");
        stringLeido = teclado.nextLine();
        
        //Pasamos el string a minusculas
        leidoMinus = stringLeido.toLowerCase();
        //Creamos el array con el tamanyo del string
        char[] arrayDeChars = new char[leidoMinus.length()];
        //Rellenamos el array con el las letras de cada palabra
        for (int i = 0; i < arrayDeChars.length; i++) {
            arrayDeChars[i] = leidoMinus.charAt(i);
        }
        //Imprime el array
        for (char arrayDeChar : arrayDeChars) {
            System.out.println(arrayDeChar);
        }
        System.out.println("-------Ordenado con el metodo burbuja------");

        int aux;
        for (int i = 0; i < arrayDeChars.length - 1; i++) {
            for (int j = 0; j < arrayDeChars.length - i - 1; j++) {
                if (arrayDeChars[j + 1] < arrayDeChars[j]) {
                    aux = arrayDeChars[j + 1];
                    arrayDeChars[j + 1] = arrayDeChars[j];
                    arrayDeChars[j] = (char) aux;
                }
            }
        }
        for (char arrayDeChar : arrayDeChars) {
            System.out.println(arrayDeChar);
        }
    }
}
