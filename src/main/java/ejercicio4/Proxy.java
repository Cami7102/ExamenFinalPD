package ejercicio4;

import java.util.List;

public class Proxy implements IServidores{

    private IServidores servidor1;
    private IServidores servidor2;
    private List<Usuarios> usu;

    /*
    public Proxy(IServidores servidor1, IServidores servidor2, List<Usuarios> usu) {
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
        this.usu = usu;
    }

     */

    @Override
    public void login(Usuarios usuarios, String nombre, String psw) {
        if(nombre.equals(usuarios.getNombre()) && psw.equals(usuarios.getPws())){
            System.out.println("Usuario correcto");
        }else{
            System.out.println("Usuario incorrecto");
        }
    }

    public void primo(int dato){
        if(dato == 0){
            System.out.println("No es Primo");
            if(dato == 1){
                System.out.println("No es Primo");
                if(dato == 4){
                    System.out.println("No es Primo");
                }
            }
        }
        primo(dato);
    }
}
