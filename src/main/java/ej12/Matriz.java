/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import ej7.Utilidades;
import java.util.Random;

/**
 *
 * @author imad
 */
public class Matriz {

    private static int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
        inicializacionDeArraysConNumerosAleatorios(matriz);
    }

    public Matriz() {
        matriz = new int[2][3];
        inicializacionDeArraysConNumerosAleatorios(matriz);
    }

    public int[][] getMatriz() {
        return matriz;
    }

    private static void inicializacionDeArraysConNumerosAleatorios(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Utilidades.generadorNumeroAleatorioEntreDosRangos(1, 100);

            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "Matriz{" + "matriz=" + matriz + '}';
    }

}
