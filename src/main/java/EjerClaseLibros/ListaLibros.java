/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerClaseLibros;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class ListaLibros {
//atributo encapsulado de tipo lista 

    private ArrayList<Libros> lista;

    //Constructor por defecto, solo instancia la estructura list
    //sin incluir ningun objeto
    public ListaLibros() {
        this.lista = new ArrayList<>();
    }
//Guarda un libro al final de la lista, si no es null

    public void insertarLibro(Libros libro) {
        if (libro != null) {
            lista.add(libro);
        }
    }
    
    public void imprimirConsola() {
        System.out.println("Imprimir lista de libros---");
        lista.forEach(System.out::println);
    }
    
    public int getCantidadLibros() {
        return lista.size();
    }

    //Buscar posicion segun un dato espcifico devuelve la posicion
    public int devolverPosicionLibroSegunIsbn(String Isbn) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIsbn().equals(Isbn)) {
                return lista.indexOf(i);
            }
        }
        return -1;
    }
    
    public Libros buscarIsbn(String isbn) {
        Libros aux = new Libros(isbn, "", "", 5,2.2);
        int indice = lista.indexOf(aux);
        if (indice >= 0) {
            return lista.get(indice);
        }
        return null;
    }
    
    public ArrayList<Libros> buscarPorPrecio(double precio) {
        ArrayList<Libros> listaDevuelta = new ArrayList<>();
        
        for (Libros libros : this.lista) {
            
            if (libros.getPrecio() == precio) {
                listaDevuelta.add(libros);
            }
        }
        return listaDevuelta;
        
    }

    //Eliminar libro
    public boolean eleminarLibro(Libros libro) {
        return lista.remove(libro);
        
    }
}
