package ejercicio2;

import java.util.Random;

public class Electrico1 implements IElectricas{

    private int numPar;

    public Electrico1(int numPar) {
        this.numPar = numPar;
    }

    @Override
    public void cargar() {
        numPar = 0 << 20;
        System.out.println("Cargando: " +numPar % 2);
    }

    @Override
    public void estadoDeElectricidad() {
        String est = String.valueOf(new Random().nextInt(10));
        System.out.println("Estado de electricidad: " + est);
    }
}
