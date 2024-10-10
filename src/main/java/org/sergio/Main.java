package org.sergio;

public class Main {
    public static void main(String[] args) {

        Videojuego zelda = new VideojuegoDigital("The Legend of Zelda", "Switch", "Aventura", 50.00);
        Videojuego fortnite = new VideojuegoDigital("Fortnite", "PC", "Accion", 0.00);
        Videojuego fifa = new VideojuegoFisico("Fifa25", "PlayStation", "Deporte", 85.00);
        Videojuego forza = new VideojuegoDigital("ForzaHorizon5", "Xbox", "Carreras", 60.00);

        System.out.println(fifa.toString());
    }
}