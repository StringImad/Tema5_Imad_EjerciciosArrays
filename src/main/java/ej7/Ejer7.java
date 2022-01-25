package ej7;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author imad
 */
public class Ejer7 {

    public static void main(String[] args) {
        //Declaracion de variables
        int tamArray;
        //Declaracion de arrays
        int[] array1;
        int[] array2;

        System.out.println("Introduce el tamaño de los dos arrays");
        tamArray = Utilidades.ComprobadorIntroduccionInt();
        array1 = new int[tamArray];
        array2 = new int[tamArray];
        inicializacionDeArraysConNumerosAleatorios(array1);
        inicializacionDeArraysConNumerosAleatorios(array2);
        System.out.println("-----------Array 1-------------");
        mostrarArray(array1);
        System.out.println("-----------Array 2-------------");

        mostrarArray(array2);
        System.out.println("----------Multiplicando arrays--------");
        
        mostrarArray(multiplicarArrays(array1, array2));
        
    }

    private static void inicializacionDeArraysConNumerosAleatorios(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Utilidades.generadorNumeroAleatorioEntreDosRangos(1, 100);
        }
    }

    private static int[] multiplicarArrays(int[] arr1, int[] arr2) {
        int[] arrayMultiplicado = new int[arr1.length];

        for (int i = 0; i < arrayMultiplicado.length; i++) {
            arrayMultiplicado[i] = arr1[i] * arr2[i];

        }

        return arrayMultiplicado;
    }

    private static void mostrarArray(int[] arrayRecibe) {
        for (int i : arrayRecibe) {
            System.out.println(i);
        }
    }

}
