package com.mascota.gestion;

public class Main {
    public static void main(String[] args) {
      Perro perro =new Perro("Sushi", "Canino", "Buldog", 10, "Mediano", "Azul", "Saludable");
       perro.hacerSonido();
       perro.alimentar();
       perro.cuidar();
       perro.mostrarInformacion();
       System.out.println("--------------------------------------------------------------------------------------------------");


        Gato g1 = new Gato("Philip", "Felino", "Persa", 5, "Grande", "Negro", "Mela");
        g1.hacerSonido();
        g1.alimentar();
        g1.cuidar();
        g1.mostrarInformacion();
        System.out.println("--------------------------------------------------------------------------------------------------");

        Tortuga t1 = new Tortuga("Toby", "Ave", "Domestica", 3, "Pequeña", "Café", "mal");
        t1.hacerSonido();
        t1.alimentar();
        t1.cuidar();
        t1.mostrarInformacion();
        System.out.println("--------------------------------------------------------------------------------------------------");

        Pajaro pajaro = new Pajaro("Bird", "Canario","Desconocida", 2, "Pequeño", "Rojo", "Bien");
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();
        pajaro.mostrarInformacion();
    }
}