package ejercicio1;

public class Client {
    public static void main(String[] args){
        Turista turista = new Turista();

        turista.setNombre("Edgar");
        turista.setCi("1234567");
        turista.setMonto(7000);

        LaPaz laPaz = new LaPaz();
        laPaz.setNombre("Ciudad de La Paz");
        laPaz.setNumProv("8");
        laPaz.setNumHabi("10000000");
        laPaz.setClima("Soleado");
        laPaz.setDinero(7000);
/*
        Cochabamba cochabamba = new Cochabamba();
        cochabamba.setNombre("Ciudad de La Paz");
        cochabamba.setNumProv("8");
        cochabamba.setNumHabi("10000000");
        cochabamba.setClima("Veraniego");
        cochabamba.setDinero(7000);

        SantaCruz santaCruz = new SantaCruz();
        santaCruz.setNombre("Ciudad de La Paz");
        santaCruz.setNumProv("8");
        santaCruz.setNumHabi("10000000");
        santaCruz.setClima("Nublado");
        santaCruz.setDinero(7000);

 */
    }
}
