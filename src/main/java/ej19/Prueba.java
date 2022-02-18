/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej19;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Prueba {

    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //declaracion de objeto
        Avion airbus = new Avion();
        //Declaracion de variable
        int opcionElegida;
        //Boolean de salida del menu
        boolean salir = true;
        do {
            System.out.println("bienvenido al menu\n¿Que desea realizar?\n"
                    + "1.- Reservar\n"
                    + "2.- Cancelar\n"
                    + "3.- Ver asientos\n"
                    + "4.- Salir");
            opcionElegida = ComprobadorIntroduccionInt();

            switch (opcionElegida) {
                case 1:
                    airbus.imprimir();
                    airbus.modificadorAsientos(comprobadorAsientoCorrecto());
                    break;
                case 2:
                    airbus.imprimir();
                    airbus.modificadorAsientosCancelar(comprobadorAsientoCorrecto());
                    break;
                case 3:
                    airbus.imprimir();
                    break;
                case 4:
                    salir = false;
                    break;
            }
        } while (salir);

    }

    private static String comprobadorAsientoCorrecto() {
        String asiento;
        String patron = "([10-25]||[0-9]\\,[1-4]{1})";
        do {
            System.out.println("El formato a seguir es: Fila numero,Columna numero(00-25,1-4)\n"
                    + "Introduce el asiento que desea reservar: ");
            asiento = teclado.nextLine();
        } while (!asiento.matches(patron));
        return asiento;
    }

    //metodo que utilizamos para introduir un numer entro y comprueba si es valido, si lo es lo devuelve
    private static int ComprobadorIntroduccionInt() {
        int numeroIntroducido = 0;
        boolean repeticion = false;
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
        teclado.nextLine();
        return numeroIntroducido;

    }
}
