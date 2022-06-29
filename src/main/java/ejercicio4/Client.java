package ejercicio4;

public class Client {
    public static void main(String[] args) {

        Proxy proxy = new Proxy();

        Usuarios usuars = new Usuarios("Joge", "12345", "pd78");
        Usuarios usuarios = new Usuarios("Jorge", "12345", "pd77");

        proxy.login(usuars, "Joge", "pd78");
        proxy.login(usuarios, "Jorge", "pd77");
    }
}
