/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerClaseCuadradoMagico;

/**
 *
 * @author imad
 */
public class MatrizCuadrada {

    private char[][] matriz;

    public MatrizCuadrada(char[][] matriz) {
        this.matriz = matriz;
    }

    public MatrizCuadrada() {
        matriz = new char[10][10];
        inicializacionDeMatriz(matriz);
    }

    //metodo privado estatico que inicializa todas las posiciones del array en un char letra que cuando llega a z empieza otra vez a a
    private static void inicializacionDeMatriz(char[][] array) {
        int letra = 'a';
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char) letra;
                letra++;
                if (letra == 'z') {
                    letra = 'a';
                }
            }
        }
    }

    public void recorrerFila(int iFila) {
        for (int i = 0; i < matriz.length; i++) {
            if (i == iFila) {
                for (int j = 0; j < matriz[i].length; j++) {
                    char asiento = matriz[i][j];
                    System.out.print(asiento + "|");
                }
            }
        }
    }

    public void recorrerColumna(int jColumna) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == jColumna) {
                    char asiento = matriz[i][j];
                    System.out.println(asiento + "|");
                }

            }

        }
    }

    public void recorrerVecinas(int iFila, int jColumna) {
        boolean seSale = false;
        String vecinasJuntas = null, vecinasArriba = null, vecinasAbajo = null;
        String vecinas = "";
        String vecinasMayus = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == jColumna && i == iFila) {
                    try {
                        vecinas = matriz[i][j] + "";
                        vecinasArriba = matriz[i - 1][j - 1] + "|" + matriz[i - 1][j] + "|" + matriz[i - 1][j + 1];
                        vecinasJuntas = matriz[i][j - 1] + "|" + vecinas + "|" + matriz[i][j + 1];
                        vecinasAbajo = matriz[i + 1][j - 1] + "|" + matriz[i + 1][j] + "|" + matriz[i + 1][j + 1];

                        seSale = true;

                    } catch (IndexOutOfBoundsException IOOBE) {
                        System.out.println("Excepcion");
                        seSale = false;
                    }
                    if (seSale) {
                        System.out.println(vecinasArriba);
                        System.out.println(vecinasJuntas);
                        System.out.println(vecinasAbajo);

                    }
                }

            }

        }
    }

    public void imprimir() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                char asiento = matriz[i][j];
                System.out.print(asiento + "|");
            }
            System.out.println("");
        }
    }

}
