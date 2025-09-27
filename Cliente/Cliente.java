package Cliente;
public class Cliente{

    private String nombre;
    private String correo;
    

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
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

    // Opcional pero recomendado: Método toString() para una mejor representación
    public String toString() {
        return "Cliente{" +
               "nombre='" + nombre + '\'' +
               ", correo='" + correo + '\'' +
               '}';
    }

}