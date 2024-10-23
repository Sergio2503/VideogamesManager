package org.sergio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Consola implements IConsola {

    private Plataforma plataforma;

    private List<Videojuego> videojuegoInstalado = new ArrayList<>();

    private String almacenamiento;

    public Consola(Plataforma plataforma) {
        this.plataforma = plataforma;
        this.almacenamiento = "./src/main/resources/" + this.plataforma().toString() + ".txt";
    }

    @Override
    public void encender() {

        System.out.println("Encendida");
        try {
            BufferedReader bufferedReader = crearAlmacenamientoLocal();
            instalarJuegos(bufferedReader);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void instalarJuegos(BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] gameArray = getGameArrayFromline(line);
            instalarJuegoPorTipoDeMemoria(gameArray);
        }
    }

    private BufferedReader crearAlmacenamientoLocal() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(almacenamiento)));
        return bufferedReader;
    }

    private static String[] getGameArrayFromline(String line) {
        String[] gameArray = line.split("#");
        return gameArray;
    }

    private void instalarJuegoPorTipoDeMemoria(String[] gameArray) {
        Type type = Type.valueOf(gameArray[4]);
        if (type.equals(Type.DIGITAL)) {
            VideojuegoDigital videoJuegoDigital = new VideojuegoDigital(gameArray);
            videojuegoInstalado.add(videoJuegoDigital);
        } else {
            VideojuegoFisico videoJuegoFisico = new VideojuegoFisico(gameArray);
            videojuegoInstalado.add(videoJuegoFisico);
        }
    }
    @Override
    public void apagar() {
        System.out.println("Apagado");
    }

    @Override
    public void instalarJuego(Videojuego juego) throws IOException {
        System.out.println("instalando: " + juego.getNombre());
        if (gameIsCompatible(juego) && videoGameNotInstalled(juego)) {
            addGameToStorage(juego);
            videojuegoInstalado.add(juego);
        } else {
            System.out.println("videoGame can't be installed");
        }
    }

    private boolean gameIsCompatible(Videojuego game) {
        return this.plataforma.equals(game.getPlataforma());
    }

    private boolean videoGameNotInstalled(Videojuego game) {
        return !videojuegoInstalado.contains(game);
    }

    private void addGameToStorage(Videojuego game) throws IOException {
        FileWriter fileWriter = new FileWriter(new File(almacenamiento), true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(game.toString());
        bufferedWriter.close();
    }

    @Override
    public void jugarJuego(Videojuego game) {
        System.out.println("jugando: " + game.getNombre());
    }

    @Override
    public String plataforma() {
        return "";
    }
}