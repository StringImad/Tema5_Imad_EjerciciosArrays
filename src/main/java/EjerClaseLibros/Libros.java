/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerClaseLibros;

import java.util.Objects;

/**
 *
 * @author imad
 */
public class Libros {
    private String isbn;
    private String nombre;
    private String editorial;
    private int numPag;
    private double precio;
    public Libros() {
    }

    public Libros(String isbn, String nombre, String editorial, int numPag, double precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numPag = numPag;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libros{" + "isbn=" + isbn + ", nombre=" + nombre + ", editorial=" + editorial + ", numPag=" + numPag + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.isbn);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.editorial);
        hash = 79 * hash + this.numPag;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

//CONSIDERAMOS DOS LIBROS IGUALES CUNADO ISBM COINCIDE
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
//        if (this.numPag != other.numPag) {
//            return false;
//        }
//        if (!Objects.equals(this.isbn, other.isbn)) {
//            return false;
//        }
//        if (!Objects.equals(this.nombre, other.nombre)) {
//            return false;
//        }
        return Objects.equals(this.isbn, other.isbn);
    }
    
    
    
}
