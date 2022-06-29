package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServidores{
    private List<Usuarios> usu = new ArrayList<>();


    @Override
    public void login(Usuarios usuarios, String nombre, String psw) {
        usu.add(usuarios);
    }
}
