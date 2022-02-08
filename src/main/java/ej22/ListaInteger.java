/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej22;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author imad
 */
public class ListaInteger {

    private ArrayList<Integer> listaInteger;

    public ListaInteger() {
        listaInteger = new ArrayList<>();
    }

    public ListaInteger(int tam) {
        listaInteger = new ArrayList<>(tam);
        for (int i = 0; i < tam; i++) {
            Integer aux = generadorNumeroAleatorioEntreDosRangos(10, 100);
            listaInteger.add(aux);
        }
//        rellenarLista(listaInteger);
    }
//    public void rellenarLista(ArrayList<Integer> listaRecibida){
//        for (int i = 0; i < listaRecibida.size(); i++) {
//            Integer aux = generadorNumeroAleatorioEntreDosRangos(10, 100);
//            listaRecibida.add(aux);
//        }
//    }

    private static int generadorNumeroAleatorioEntreDosRangos(int RANGO_MIN, int RANGO_MAX) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
    }

    public ArrayList<Integer> getListaInteger() {
        return listaInteger;
    }

    public void setListaInteger(ArrayList<Integer> listaInteger) {
        this.listaInteger = listaInteger;
    }

    @Override
    public String toString() {
        return "Ejer22{" + "listaInteger=" + listaInteger + '}';
    }

}
