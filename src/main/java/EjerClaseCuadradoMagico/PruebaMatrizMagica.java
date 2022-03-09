/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerClaseCuadradoMagico;

/**
 *
 * @author imad
 */
public class PruebaMatrizMagica {

    public static void main(String[] args) {
        //declaracion de objeto
        MatrizCuadrada matrizPorDefecto = new MatrizCuadrada();

        matrizPorDefecto.imprimir();
        System.out.println("----------------Recorriendo fila 3------------------");
        matrizPorDefecto.recorrerFila(2);
        System.out.println("\n----------------Recorriendo columna 4------------------");
        matrizPorDefecto.recorrerColumna(3);
        System.out.println("\n----------------Recorriendo columna y filas vecinas------------------");
        matrizPorDefecto.recorrerVecinas(0, 0);

    }
}
