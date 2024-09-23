package com.mascota.gestion;

public class Gato extends Mascota{


    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadodesalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadodesalud);
    }


    @Override
    public void hacerSonido() {
        System.out.println("El Gato está maullando ¡Miauuu!");
    }

    @Override
    public void cuidar() {
        System.out.println( "Estamos Bañando al Gato!");
    }

    @Override
    public void alimentar() {
        System.out.println("El Gato está comiendo cuido.");
    }
    
}
