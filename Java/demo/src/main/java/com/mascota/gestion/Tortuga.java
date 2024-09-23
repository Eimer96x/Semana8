package com.mascota.gestion;

public class Tortuga extends Mascota{


    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadodesalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadodesalud);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("La tortuga está gruñendo ¡Grrrrrrr!");
    }

    @Override
    public void cuidar() {
        System.out.println( "Estamos limpiando a la tortuga");
    }

    @Override
    public void alimentar() {
        System.out.println("La tortuga está comiendo algas.");
    }
}

