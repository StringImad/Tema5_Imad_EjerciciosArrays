/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24;

/**
 *
 * @author imad
 */
public class PruebaListaCanciones {

    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion();
        lista.grabarCancion(new Cancion("H", "A", "5min", 2222));
        lista.grabarCancion(new Cancion("J", "B", "2min", 2222));
        lista.grabarCancion(new Cancion("R", "C", "8min", 2222));
        lista.grabarCancion(new Cancion("A", "A", "6min", 2222));
        lista.grabarCancion(new Cancion("H", "H", "5min", 2222));
        lista.grabarCancion(new Cancion("J", "YDR", "2min", 2222));
        lista.grabarCancion(new Cancion("R", "QC", "8min", 2222));
        lista.grabarCancion(new Cancion("A", "TTA", "6min", 2222));
        lista.grabarCancion(new Cancion("H", "NB", "5min", 2222));
        lista.grabarCancion(new Cancion("J", "TD", "2min", 2222));
        lista.grabarCancion(new Cancion("R", "LC", "8min", 2222));
        lista.grabarCancion(new Cancion("A", "A", "6min", 2222));
//        ListaReproduccion.imprimirLista(lista);
        System.out.println("------------lista normal------------------");
        ListaReproduccion.imprimirListaEntera(lista);
        System.out.println("---------------Ordenando por duracion-----------");
        lista.ordenarPorDuracion();
        ListaReproduccion.imprimirListaEntera(lista);
        System.out.println("---------------Ordenando por titulo-----------");
        lista.ordenarComparatorNombre();
        ListaReproduccion.imprimirListaEntera(lista);
        System.out.println("---------------Ordenando por titulo y duracion-----------");
        lista.ordenarTituloDuracion();
        ListaReproduccion.imprimirListaEntera(lista);
        System.out.println("---------------Desordenando lista-----------");
        lista.mezclarLista();
        ListaReproduccion.imprimirListaEntera(lista);

        int posicion = lista.buscarBinariaTitulo(new Cancion("A", "A", "6min", 2222));
        System.out.println("la cancion esta en la posicion: " + posicion
        );
        ListaReproduccion.imprimirListaEntera(lista);

    }
}
