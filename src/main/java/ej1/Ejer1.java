/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author imad
 */
public class Ejer1 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
             suma += numeros[i];
        }
        System.out.println("--------------suma-------------");

        System.out.println(suma);
    }
}
