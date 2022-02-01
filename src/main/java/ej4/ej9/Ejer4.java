package ej4.ej9;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author imad
 */
public class Ejer4 {
    
    public static void main(String[] args) {
        int[] array = {1, 7, 2, 3, 4, 300, 52, 5};
        int numeroAEncontrar;
        int posicion = 0;
        boolean esta = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero a encontrar");
        numeroAEncontrar = teclado.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroAEncontrar) {
                posicion = i;
                esta = true;
            }            
        }
        if (esta) {
            System.out.println("La posicion del array es: " + posicion);
        } else {
            System.out.println("No esta ese numero");
        }
        metodoBurbuja(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    
    private static void metodoBurbuja(int[] arrayRecibe) {
        int tmp;
        for (int i = 0; i < arrayRecibe.length - 1; i++) {
            for (int j = i + 1; j < arrayRecibe.length; j++) {
                if (arrayRecibe[i] > arrayRecibe[j]) {
                    tmp = arrayRecibe[i];
                    arrayRecibe[i] = arrayRecibe[j];
                    arrayRecibe[j] = tmp;
                }
            }
            
        }
    }
}
