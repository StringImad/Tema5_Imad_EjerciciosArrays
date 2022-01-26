/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.Arrays;

/**
 *
 * @author imad
 */
public class Ejer3 {

    public static void main(String[] args) {
        double[] array1 = new double[20];
        double[] arrayCopiado ;

        Arrays.fill(array1, 7.5);
        mostrarArray(array1);
        arrayCopiado = copiarArrays(array1);
        System.out.println("\n------------Array Copiado------------------\n");
        mostrarArray(arrayCopiado);
        
       
    }

    private static double[] copiarArrays(double[] arr1) {
        double[] arrayMultiplicado = new double[arr1.length];

        for (int i = 0; i < arrayMultiplicado.length; i++) {
            arrayMultiplicado[i] = arr1[i];

        }

        return arrayMultiplicado;
    }

    private static void mostrarArray(double[] arrayRecibe) {
        for (double i : arrayRecibe) {
            System.out.print(i + " - ");
        }
    }
}
