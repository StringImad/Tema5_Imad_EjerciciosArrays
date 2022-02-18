/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author imad
 */
public class PruebaMatriz {

    public static void main(String[] args) {
        Matriz matrizPorDefecto = new Matriz();
        System.out.println("----------------Matriz por defecto-----------------");
        matrizPorDefecto.imprimir();
        int[][] matrizUsuario = new int[10][30];
        Matriz matrizParametrizada = new Matriz(matrizUsuario);
        System.out.println("----------------Matriz Usuario----------------------");
        matrizParametrizada.imprimir();
    }
}
