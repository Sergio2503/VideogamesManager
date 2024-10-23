package org.sergio;

import java.io.IOException;

public interface IConsola {

    void encender();

    void apagar();

    void instalarJuego(Videojuego juego) throws IOException;

    void jugarJuego(Videojuego game);

    String plataforma();
}
