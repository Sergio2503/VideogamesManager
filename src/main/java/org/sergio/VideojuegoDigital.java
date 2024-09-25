package org.sergio;

public class VideojuegoDigital extends Videojuego {

    public VideojuegoDigital(String Nombre, String Plataforma, String Genero, Double Precio) {
        super(Nombre, Plataforma, Genero, Precio);
    }

    public double PrecioDigital = Precio;
}
