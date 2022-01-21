/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ejer5 {
    public static void main(String[] args) {
        int [] array = new int[10];
        almacenaValoresEnElArray(array);
        mostrarArray(array);
        contarPositivos(array);
        contarNegativos(array);
        contarCeros(array);
        
        calcularMediaPositivos(array);
        calcularMediaNegativos(array);
        
        
    }
    
    
//Lee valores por teclado y almacena en el array. Se le pasa el array como parámetro y no devuelve nada.
    private static void almacenaValoresEnElArray(int[] arrayRecibe) {
        int numeroEntero;
        for (int i = 0; i < arrayRecibe.length; i++) {
            System.out.println("Introduce los valores en la posicion " + (i + 1));
            numeroEntero = ComprobadorIntroduccionInt();
            arrayRecibe[i] = numeroEntero;
        }
        
    }

    private static int contarPositivos(int[] arrayRecibe) {
        int positivo = 0;
        for (int i : arrayRecibe) {
            if (i > 0) {
                positivo++;
            }
        }
        return positivo;
    }
    
    private static int contarNegativos(int[] arrayRecibe) {
        int negativo = 0;
        for (int i : arrayRecibe) {
            if (i < 0) {
                negativo++;
            }
        }
        return negativo;
    }
    
    private static int contarCeros(int[] arrayRecibe) {
        int ceros = 0;
        for (int i : arrayRecibe) {
            if (i == 0) {
                ceros++;
            }
        }
        return ceros;
    }
    
    private static void mostrarArray(int[] arrayRecibe) {
        for (int i : arrayRecibe) {
            System.out.println(i);
        }
    }
    
    private static void calcularMediaPositivos(int[] arrayRecibe) {
        double media = 0.0;
        int[] arrayPositivos = new int[contarPositivos(arrayRecibe)];
        
        for (int i : arrayRecibe) {
             if (arrayRecibe[i] > 0) {
                arrayPositivos[i] = arrayRecibe[i];
            }
        }
//        for (int i = 0; i < arrayRecibe.length; i++) {
//           
//            
//        }
        media = media / arrayPositivos.length;
        System.out.println("Media de los positivos: " + media);
    }
    
    private static void calcularMediaNegativos(int[] arrayRecibe) {
        double media = 0.0;
        int[] arrayNegativos= new int[contarNegativos(arrayRecibe)];
        
        for (int i : arrayRecibe) {
             if (arrayRecibe[i] > 0) {
                arrayNegativos[i] = arrayRecibe[i];
            }
        }
        media = media / arrayNegativos.length;
        System.out.println("Media de los negativos: " + media);
    }

    //metodo que utilizamos para introduir un numer entro y comprueba si es valido, si lo es lo devuelve
    private static int ComprobadorIntroduccionInt() {
        int numeroIntroducido = 0;
        boolean repeticion = false;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                numeroIntroducido = teclado.nextInt();
                repeticion = false;
            } catch (InputMismatchException ime) {
                repeticion = true;
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                teclado.nextLine();
            }
        } while (repeticion);
        return numeroIntroducido;
        
    }
}
