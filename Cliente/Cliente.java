package Cliente;
public class Cliente{

    private String nombre;
    private String correo;
    private int id;
    private static int contador=1;
    

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.id=contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
      return this.id;
    }

    public String toString() {
        return "Cliente{" +
               "nombre='" + nombre + '\'' +
               ", correo='" + correo + '\'' +
               '}';
    }

}