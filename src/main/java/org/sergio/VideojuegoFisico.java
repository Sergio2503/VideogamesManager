package org.sergio;

public class VideojuegoFisico extends Videojuego {

    private double CosteEnvio = 5.0;

    public VideojuegoFisico(String Nombre, String Plataforma, String Genero, Double Precio) {
        super(Nombre, Plataforma, Genero, Precio);
        this.CosteEnvio = CosteEnvio;
    }

    public double PrecioFinal() {
        return Precio + CosteEnvio;
    }
}