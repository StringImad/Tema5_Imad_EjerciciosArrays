/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej19;

import ej7.Utilidades;

/**
 *
 * @author imad
 */
public class Avion {

    private char[][] matriz;

    public Avion(char[][] matriz) {
        this.matriz = matriz;
    }

    public Avion() {
        matriz = new char[25][4];
        inicializacionDeAsientosVacios(matriz);
    }
//metodo privado estatico que inicializa todas las posiciones del array en un char Vacio
    private static void inicializacionDeAsientosVacios(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';

            }
        }
    }
//metodo publico que recibe un string de los asientos a modificar y 
    public void modificadorAsientos(String numAsientoRecibido) {
        int numi, numj;
        String[] numAsiento = numAsientoRecibido.split("\\,");
        numi = Integer.parseInt(numAsiento[0]);
        numj = Integer.parseInt(numAsiento[1]);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((numi-1)==i&&(numj-1)==j) {
                    matriz[i][j] = 'X';
                }
            }
        }
    }

     public void modificadorAsientosCancelar(String numAsientoRecibido) {
        int numi, numj;
        String[] numAsiento = numAsientoRecibido.split("\\,");
        numi = Integer.parseInt(numAsiento[0]);
        numj = Integer.parseInt(numAsiento[1]);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((numi-1)==i&&(numj-1)==j) {
                    matriz[i][j] = ' ';
                }
            }
        }
    }
    public void imprimir() {
        int contador = 1;
        System.out.println("  1 2 3 4");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("" + contador + "|");
            for (int j = 0; j < matriz[i].length; j++) {
                char asiento = matriz[i][j];
                System.out.print(asiento + "|");
            }
            contador++;
            System.out.println("");
        }
    }
}
