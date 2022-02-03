/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class LanzarMoneda {

    private static boolean[] arrayBooleanos;

    public static void main(String[] args) {
        //Declaracion de variables
        int tamArray;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        //Declaracion de array con tamanio 1000
        System.out.println("Inserta el numero de lanzamientos");
        tamArray = teclado.nextInt();
        arrayBooleanos = new boolean[tamArray];

        rellenarArrayConLanzamientos(arrayBooleanos);
        imprimirArray(arrayBooleanos);
    }
//simula 1000 lanzamientos de una moneda. 
//El método  almacenael resultado de cada tirada en el array. 

    private static void rellenarArrayConLanzamientos(boolean[] array) {
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] =aleatorio.nextBoolean();
        }
    }

    private static boolean booleanoAleatorio() {
        return generadorNumeroAleatorioEntreDosRangos(1, 2) == 1;

    }

    private static int generadorNumeroAleatorioEntreDosRangos(int RANGO_MIN, int RANGO_MAX) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
    }
//método para saber cuántas “cruces” salieron después de los lanzamientos.

    private static int contadorDeCrucesEnElArray(boolean[] arrayRecibido) {
        int contadorDeCruces = 0;
        for (int i = 0; i < arrayRecibido.length; i++) {
            if (arrayRecibido[i] == false) {
                contadorDeCruces++;
            }
        }
        return contadorDeCruces;
    }
//método para saber cuántas “caras” salieron después de los lanzamientos.

    private static int contadorDeCarasEnElArray(boolean[] arrayRecibido) {
        int contadorDeCaras = 0;
        for (int i = 0; i < arrayRecibido.length; i++) {
            if (arrayRecibido[i] == true) {
                contadorDeCaras++;
            }
        }
        return contadorDeCaras;
    }

    private static void imprimirArray(boolean[] arrayRecibido) {

        for (int i = 0; i < arrayRecibido.length; i++) {
            System.out.print("Lanzamiento " + (i + 1) + ": ");
            if (arrayRecibido[i] == true) {
                System.out.println("cara");
            } else {
                System.out.println("cruz");
            }
        }

        System.out.println("Han salido: " + contadorDeCarasEnElArray(arrayRecibido) + " caras");
        System.out.println("Han salido: " + contadorDeCrucesEnElArray(arrayRecibido) + " cruces");
    }
}
