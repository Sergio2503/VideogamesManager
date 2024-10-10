package org.sergio;

public class VideojuegoDigital extends Videojuego {

    private final Type type = Type.DIGITAL;

    public VideojuegoDigital(String Nombre, String Plataforma, String Genero, Double Precio) {
        super(Nombre, Plataforma, Genero, Precio, Type.DIGITAL);
    }

    public double PrecioFinal = Precio;
}
