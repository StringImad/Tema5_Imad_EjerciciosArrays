/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej25;

import java.util.Scanner;

/**
 *
 * @author imad
 */
public class PruebaLista {

    public static void main(String[] args) {
        int taArray = 0;

        char letra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la pila: ");
        taArray = teclado.nextInt();
        teclado.nextLine();
        Pila prueba1 = new Pila(taArray);
        for (int i = 0; i < taArray; i++) {
            System.out.println("Introduce la letra que quieras");
            letra = teclado.next().charAt(0);
            prueba1.apilar(letra);

        }
        System.out.println("---------------------Imprimiendo lista--------------------------");
        prueba1.imprimirLista();
        System.out.println("------------------Desapilando lista----------------------");

        for (int i = 0; i < taArray; i++) {
            System.out.println("Sacando de la pila el ultimo elemento en entrar: " + prueba1.desapilar());
        }

    }
}
