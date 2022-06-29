package ejercicio2;

import java.util.Random;

public class Gasolina implements INormales{

    private int capacidad;

    public Gasolina(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void llenarGasolina() {
        capacidad = 1 << 50;
        System.out.println("Llenado de gasolina: " +capacidad);
    }

    @Override
    public void estado() {
        String est = String.valueOf(new Random().nextInt(50));
        System.out.println("Estado de la gasolina: " + est);
    }
}
