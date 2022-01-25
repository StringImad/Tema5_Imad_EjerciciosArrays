package ej7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author imad
 */
public class Utilidades {
     //metodo que utilizamos para introduir un numer entro y comprueba si es valido, si lo es lo devuelve
    public static int ComprobadorIntroduccionInt() {
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
    
    public static int generadorNumeroAleatorioEntreDosRangos(int RANGO_MIN, int RANGO_MAX) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
    }
}
