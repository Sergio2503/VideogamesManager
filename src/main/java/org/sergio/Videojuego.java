package org.sergio;

import java.util.Objects;

public abstract class Videojuego {

    protected final String Nombre;
    protected final String Plataforma;
    protected final String Genero;
    protected final Double Precio;

    public Videojuego(String Nombre, String Plataforma, String Genero, Double Precio) {
        this.Nombre = Nombre;
        this.Plataforma = Plataforma;
        this.Genero = Genero;
        this.Precio = Precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Objects.equals(Nombre, that.Nombre) && Objects.equals(Plataforma, that.Plataforma) && Objects.equals(Genero, that.Genero) && Objects.equals(Precio, that.Precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Plataforma, Genero, Precio);
    }


    @Override
    public String toString() {
        return Nombre + Plataforma + Genero + Precio;
    }
}
