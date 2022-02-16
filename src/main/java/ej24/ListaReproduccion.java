/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author imad
 */
public class ListaReproduccion {

    private ArrayList<Cancion> listaCanciones;
//Condtructor por defecto crea e inicializa la lista

    public ListaReproduccion() {
        listaCanciones = new ArrayList<>();
    }
//devuelve el número de canciones de la lista.

    public int numeroCanciones() {
        return listaCanciones.size();
    }
//devuelve si la lista de reproducción está vacía.

    public boolean estaVacia() {
        return listaCanciones.isEmpty();
    }
//devuelve la Cancion que se encuentra en la posición indicada.

    public Cancion escucharCancion(int posicion) {
        return listaCanciones.get(posicion);
    }
//cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.

    public void cambiarCancion(int posicion, Cancion aCambiar) {
        listaCanciones.set(posicion, aCambiar);
    }

//Guarda un objeto al final de la lista, si no es null
    public void grabarCancion(Cancion cancion) {
        if (cancion != null) {
            listaCanciones.add(cancion);
        }
    }

    // elimina la Cancion que se encuentra en la posición indicada.
    public boolean eleminarCancion(int posicion) {
        return listaCanciones.remove(listaCanciones.get(posicion));
    }

    public boolean eleminarCancion(Cancion cancion) {
        return listaCanciones.remove(cancion);

    }

    public static void imprimirLista(ListaReproduccion tmp) {

        for (Cancion canciones : tmp.listaCanciones) {
            System.out.println(canciones.getTitulo());
        }

    }

    // imprimirLista (ListaReproduccion tmp). Método de clase que imprime los 
    // nombres de las canciones contenidas en tmp
    public static void imprimirListaForNormal(ListaReproduccion tmp) {
        for (int i = 0; i < tmp.numeroCanciones(); i++) {
            System.out.println(tmp.listaCanciones.get(i).getTitulo());
        }
    }

    public static void imprimirListaEntera(ListaReproduccion tmp) {
        for (int i = 0; i < tmp.numeroCanciones(); i++) {
            System.out.println(tmp.listaCanciones.get(i));
        }
    }

    // busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra.
    public int buscarCancion(Cancion c) {

        return listaCanciones.indexOf(c);

    }

    public void ordenarPorDuracion() {
        Collections.sort(this.listaCanciones);
    }

    public void ordenarComparatorNombre() {
        Collections.sort(listaCanciones, (Cancion l1, Cancion l2) -> l1.getTitulo().compareTo(l2.getTitulo()));
    }

    public void ordenarTituloDuracion() {
        Comparator<Cancion> criterioTitulo = (l1, l2) -> l1.getTitulo().compareTo(l2.getTitulo());
        Comparator<Cancion> criterioDuracion = (l1, l2) -> l1.getDuracion().compareTo(l2.getDuracion());
        //Criterio que los unifica, then comparing nos devuelve otro comparator
        Comparator<Cancion> criterioTituloDuracion = criterioTitulo.thenComparing(criterioDuracion);
        Collections.sort(listaCanciones, criterioTituloDuracion);
    }
    public void mezclarLista(){
        Collections.shuffle(listaCanciones);
    }
    public int buscarBinariaTitulo(Cancion c){
        //lista debe estar ordenada segun el criterio que se pasa a este metodo 
        return Collections.binarySearch(listaCanciones, c, (l1, l2) -> l1.getTitulo().compareTo(l2.getTitulo()));
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" + "listaCanciones=" + listaCanciones + '}';
    }

}
