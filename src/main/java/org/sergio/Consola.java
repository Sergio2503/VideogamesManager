package org.sergio;

public class Consola implements IConsola{
    @Override
    public void switchOn() {
        System.out.println("Encendida");
    }

    @Override
    public void switchOff() {
        System.out.println("Apagada");
    }

    @Override
    public void installGame() {
        System.out.println("Instalando");
    }

    @Override
    public void playGame() {
        System.out.println("Play");
    }

    @Override
    public String getPlataforma() {
        return this.Plataforma;
    }
}
