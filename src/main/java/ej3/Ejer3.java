/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author imad
 */
public class Ejer3 {

    public static void main(String[] args) {
        double[] array1 = new double[20];
        double[] arrayCopiado;
        int indice;
        Arrays.fill(array1, 7.5);

        arrayCopiado = Arrays.copyOf(array1, array1.length);
        System.out.println("\n------------Array Copiado------------------\n");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(arrayCopiado));
        System.out.println(Arrays.equals(array1, arrayCopiado) ? "Iguales" : "No iguales");
        indice = generadorNumeroAleatorioEntreDosRangos(0, array1.length);
        array1[indice] = 6.3;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(arrayCopiado));
        System.out.println(Arrays.equals(array1, arrayCopiado) ? "Iguales" : "No iguales");

    }

    private static int generadorNumeroAleatorioEntreDosRangos(int RANGO_MIN, int RANGO_MAX) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
    }
}
