package ejercicio2;

public class Client {
    public static void main(String []args) throws InterruptedException {
        INormales gas = new Gasolina(50);
        gas.estado();
        gas.llenarGasolina();

        INormales die = new Diesel(100);
        die.estado();
        die.llenarGasolina();

        INormales gasE = new GasolinaEspecial(20);
        gasE.estado();
        gasE.llenarGasolina();

        IElectricas uno = new Electrico1(46);
        uno.cargar();
        uno.estadoDeElectricidad();

        IElectricas dos = new Electrico2(50);
        dos.cargar();
        dos.estadoDeElectricidad();
    }
}
