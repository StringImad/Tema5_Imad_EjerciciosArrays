/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24;

import java.util.ArrayList;

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
    // busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra.
    public int buscarCancion(Cancion c) {
        
        return listaCanciones.indexOf(c);
        
    }
    
    @Override
    public String toString() {
        return "ListaReproduccion{" + "listaCanciones=" + listaCanciones + '}';
    }
    
}
