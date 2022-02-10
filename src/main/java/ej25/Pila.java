/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej25;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class Pila {

    private ArrayList<Character> lista;
    private int tamLista;

    public Pila(int tamanio) {
        tamLista = tamanio;
        this.lista = new ArrayList<>(tamLista);
        
    }

    public void apilar(char recibido) {
        lista.add(recibido);
    }

    public char desapilar() {
        char elementoBorrado = lista.get(lista.size() - 1);
        lista.remove(lista.size() - 1);
        return elementoBorrado;
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }
    public boolean estaLlena() {
        return lista.size() == tamLista;
    }

    public int numeroActualDeLaPila(){
        return lista.size();
    }

    public void imprimirLista() {
        for (Character character : lista) {
            System.out.println(character);
        }
    }

}
