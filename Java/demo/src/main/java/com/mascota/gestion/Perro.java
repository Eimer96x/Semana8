package com.mascota.gestion;

public class Perro extends Mascota {

    public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadodesalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadodesalud);

    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro esta ladrando ¡Guau!...");
    }

    @Override
    public void cuidar() {
        System.out.println( "Estamos limpiando a el perro. ");
    }

    @Override
    public void alimentar() {
        System.out.println("El perro está comiendo carne. ");
    }

    
}
