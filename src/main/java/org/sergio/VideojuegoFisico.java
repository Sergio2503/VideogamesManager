package org.sergio;

public class VideojuegoFisico extends Videojuego {

    private final Type type = Type.PHYSICAL;

    public double costeEnvio = 5.00;

    public VideojuegoFisico(String Nombre, String Plataforma, String Genero, Double Precio) {
        super(Nombre, Plataforma, Genero, Precio, Type.PHYSICAL);
        this.costeEnvio = costeEnvio;
    }

    @Override
    public void calcularPrecio() {
        System.out.println(super.Precio + this.costeEnvio);
    }

    @Override
    public String toString() {
        return Nombre +
                "#" + Plataforma +
                "#" + Precio +
                "#" + Genero +
                "#" + Precio + "\n";
    }
}
