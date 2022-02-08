/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerClaseLibros;

/**
 *
 * @author imad
 */
public class PruebaListaLibros {

    public static void main(String[] args) {
        ListaLibros catalogo = new ListaLibros();
        catalogo.insertarLibro(new Libros("1", "L", "P", 10,4));
        catalogo.imprimirConsola();
        System.out.println("Tamaño del catalogo: " + catalogo.getCantidadLibros());

    }

}
