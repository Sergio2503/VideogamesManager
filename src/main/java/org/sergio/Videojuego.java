package org.sergio;

import java.util.Objects;

public abstract class Videojuego implements IConsola {

    protected final String Nombre;
    protected final String Plataforma;
    protected final String Genero;
    protected final Double Precio;
    private Type type;

    public abstract void calcularPrecio();

    public Videojuego(String Nombre, String Plataforma, String Genero, Double Precio, Type type) {
        this.Nombre = Nombre;
        this.Plataforma = Plataforma;
        this.Genero = Genero;
        this.Precio = Precio;
        this.type = type;

    }

    public String getNombre() {
        return Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public String getGenero() {
        return Genero;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Objects.equals(Nombre, that.Nombre) && Objects.equals(Plataforma, that.Plataforma) && Objects.equals(Genero, that.Genero) && Objects.equals(Precio, that.Precio) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Plataforma, Genero, Precio, type);
    }

}