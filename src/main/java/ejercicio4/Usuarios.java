package ejercicio4;

public class Usuarios {
    private String nombre;
    private String id;
    private String pws;

    public Usuarios(String nombre, String id, String pws) {
        this.nombre = nombre;
        this.id = id;
        this.pws = pws;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }

    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Id: "+id);
        System.out.println("Pws: "+pws);
    }
}
