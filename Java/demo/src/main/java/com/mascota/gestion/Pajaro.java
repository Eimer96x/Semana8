package com.mascota.gestion;

public class Pajaro extends Mascota {

    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadodesalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadodesalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El Pajaro esta silvando ¡Piiiiiii!");
    }

    @Override
    public void cuidar() {
        System.out.println( "Estamos limpiando al Pajaro");
    }

    @Override
    public void alimentar() {
        System.out.println("El Pajaro está comiendo alpiste ");
    }

}
