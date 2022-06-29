package ejercicio1;

import java.util.Random;

public class Turista implements IVisitante{
    private String nombre;
    private String ci;
    private int monto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public void gastarLaPaz(LaPaz lapaz) {
        if(lapaz.getClima().equals("Soleado")){
            int rv = new Random().nextInt(10);
            System.out.println("Gasta: " + rv);
        }else {
            System.out.println("No gastare nada");
        }
    }

    @Override
    public void gastarCocha(Cochabamba cochabamba) {
        if(cochabamba.getClima().equals("Veraniego")){
            String rv = String.valueOf(cochabamba.getDinero() * 10 /100);
            System.out.println("Gasta: " + rv);
        }else {
            System.out.println("No gastare nada");
        }
    }

    @Override
    public void gastarSanta(SantaCruz santaCruz) {
        if(santaCruz.getClima().equals("Nublado")){
            String rv = String.valueOf(santaCruz.getDinero() * 50 /100);
            System.out.println("Gasta: " + rv);
        }else {
            System.out.println("No gastare nada");
        }
    }
}
