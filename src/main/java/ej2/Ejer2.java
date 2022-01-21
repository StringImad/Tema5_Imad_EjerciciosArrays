/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ejer2 {

    public static void main(String[] args) {
        //Declaracion de variables
        int numeroDePersonas;
        int alturaPersona;
        int numPersonasMayorMedia = 0;
        int numPersonasIgualMedia = 0;
        int numPersonasMenorMedia = 0;
        double media = 0.0;

        int[] alturasLeidas;
        
        do {
            System.out.println("Introduce el numero de personas");
            numeroDePersonas =ComprobadorIntroduccionInt();
        } while (numeroDePersonas <= 0);
        alturasLeidas = new int[numeroDePersonas];

        for (int i = 0; i < alturasLeidas.length; i++) {
            System.out.println("Introduce la altura en cm de la persona en la posicion: " + (i + 1));
            alturaPersona = ComprobadorIntroduccionInt();
            alturasLeidas[i] = Math.abs(alturaPersona);
            media = media + alturasLeidas[i];

        }
        media = media / alturasLeidas.length;

        System.out.println("Media de altura es: " + media);
        for (int alturasLeida : alturasLeidas) {
            if (alturasLeida < media) {
                numPersonasMenorMedia++;
            } else if (alturasLeida == media) {
                numPersonasIgualMedia++;
            } else {
                numPersonasMayorMedia++;
            }
        }
        System.out.println("El numero de personas con una altura mayor que la media es: " + numPersonasMayorMedia
                + " \nnumero de personas menor de la media: " + numPersonasMenorMedia + "\n"
                + "numero de personas igual que la media: " + numPersonasIgualMedia);
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
