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
                    char letra = matriz[i][j];
                    System.out.print(letra + "|");
                }
            }
        }
    }

    public void recorrerColumna(int jColumna) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == jColumna) {
                    char letra = matriz[i][j];
                    System.out.println(letra + "|");
                }

            }

        }
    }

    public void recorrerVecinas(int iFila, int jColumna) {
        String vArI, vA, vArD,
                vI, buscada, vD,
                vAbI, vAb, vAbD;
        String vecinasArriba,
                vecinasJuntas,
                vecinasAbajo;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == jColumna && i == iFila) {
                    buscada = matriz[i][j] + "";
                    try {
                        vArI = matriz[i - 1][j - 1] + "";

                    } catch (IndexOutOfBoundsException IOOBE) {
                        vArI = "";
                    }
                    try {
                        vA = matriz[i - 1][j] + "";

                    } catch (IndexOutOfBoundsException IOOBE) {
                        vA = "";
                    }
                    try {
                        vArD = matriz[i - 1][j + 1] + "";

                    } catch (IndexOutOfBoundsException IOOBE) {
                        vArD = "";
                    }
                    try {
                        vI = matriz[i][j - 1] + "";
                    } catch (IndexOutOfBoundsException IOOBE) {
                        vI = "";
                    }
                    try {
                        vD = matriz[i][j + 1] + "";
                    } catch (IndexOutOfBoundsException IOOBE) {
                        vD = "";
                    }
                    try {
                        vAbI = matriz[i + 1][j - 1] + "";
                    } catch (IndexOutOfBoundsException IOOBE) {
                        vAbI = "";
                    }
                    try {
                        vAb = matriz[i + 1][j] + "";

                    } catch (IndexOutOfBoundsException IOOBE) {
                        vAb = "";
                    }
                    try {
                        vAbD = matriz[i + 1][j + 1] + "";

                    } catch (IndexOutOfBoundsException IOOBE) {
                        vAbD = "";
                    }

                    vecinasArriba = vAbI + "|" + vA + "|" + vArD;
                    vecinasJuntas = vI + "|" + buscada + "|" + vD;
                    vecinasAbajo = vAbI + "|" + vAb + "|" + vAbD;

                    System.out.println(vecinasArriba);
                    System.out.println(vecinasJuntas);
                    System.out.println(vecinasAbajo);

                }

            }

        }
    }

    private static String capturadorDeExcepciones(int posicion) {
        String corregido = "";
        try {
            corregido = posicion + "";

        } catch (IndexOutOfBoundsException IOOBE) {
            corregido = "";
        }
        return corregido;

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
