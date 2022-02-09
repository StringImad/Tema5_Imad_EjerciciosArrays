/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej24;

import java.util.Objects;

/**
 *
 * @author imad
 */
public class Cancion {
    private String autor;
    private String titulo;
    private String duracion;
    private int reproducciones;

    public Cancion(String autor, String titulo, String duracion, int reproducciones) {
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
        this.reproducciones = reproducciones;
    }

    public Cancion() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.autor);
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.duracion);
        hash = 79 * hash + this.reproducciones;
        return hash;
    }

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
        final Cancion other = (Cancion) obj;
        if (this.reproducciones != other.reproducciones) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.duracion, other.duracion);
    }

    @Override
    public String toString() {
        return "Cancion{" + "autor=" + autor + ", titulo=" + titulo + ", duracion=" + duracion + ", reproducciones=" + reproducciones +"\n"+ '}';
    }
    
    
}
