package org.sergio;

public class VideojuegoDigital extends Videojuego {

    private final Type type = Type.DIGITAL;

    public VideojuegoDigital(String Nombre, String Plataforma, String Genero, Double Precio) {
        super(Nombre, Plataforma, Genero, Precio, Type.DIGITAL);
    }

    public double PrecioFinal = Precio;

    public VideojuegoDigital(String[] gameArray) {
        super(gameArray);
    }

    @Override
    public void calcularPrecio() {
        System.out.println(Precio);
    }

    @Override
    public String toString() {
        return Nombre +
                " " + Plataforma +
                " " + Precio +
                " " + Genero +
                " " + Precio + "\n";
    }
}
