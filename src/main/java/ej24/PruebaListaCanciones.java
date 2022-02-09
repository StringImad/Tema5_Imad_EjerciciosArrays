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
        lista.grabarCancion(new Cancion("H", "B", "5min", 2222));
        lista.grabarCancion(new Cancion("He", "B", "5min", 2222));
        lista.grabarCancion(new Cancion("Hdd", "Bw", "5min", 2222));
        lista.grabarCancion(new Cancion("Hddd", "Bdd", "5min", 2222));
        ListaReproduccion.imprimirLista(lista);
    }
}
