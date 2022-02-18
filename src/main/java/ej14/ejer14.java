/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

import ej7.Utilidades;

/**
 *
 * @author imad
 */
public class ejer14 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int media = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Utilidades.generadorNumeroAleatorioEntreDosRangos(1, 10);

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media = media + matriz[i][j];
                System.out.println("Media actual: " + media);

            }
        }
        int longitud = 0;
        System.out.println("-----Imprimiendo la matriz--------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");

            }
            longitud += matriz.length;

            System.out.println("");
        }
        System.out.println("longitud matriz: " + longitud);
        media = media / longitud;

        System.out.println("La media es: " + media);
   for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]>Integer.MIN_VALUE){
                    
                }

            }
            longitud += matriz.length;

            System.out.println("");
        }
    }
}
