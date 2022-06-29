package ejercicio1;

public class LaPaz implements IBolivia{
    private String nombre;
    private String numProv;
    private String NumHabi;
    private String clima;
    private int dinero;

    public LaPaz (){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumProv() {
        return numProv;
    }

    public void setNumProv(String numProv) {
        this.numProv = numProv;
    }

    public String getNumHabi() {
        return NumHabi;
    }

    public void setNumHabi(String numHabi) {
        NumHabi = numHabi;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public void viaje(IVisitante visitante) {
        visitante.gastarLaPaz(this);
    }

    @Override
    public void gasto(int monto) {
        this.dinero = monto;
    }
}
