public class Cliente{

    private String nombre;
    private String correo;
    private double cuentaTotal;

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




    public void comprarComida(double costoComida) {
        if (costoComida > 0) {
            this.cuentaTotal += costoComida;
            System.out.println(this.nombre + " ha comprado comida. La nueva cuenta es: $" + this.cuentaTotal);
        } else {
            System.out.println("Error: El costo de la comida debe ser positivo.");
        }
    }

    public void comprarBebida(double costoBebida) {
        if (costoBebida > 0) {
            this.cuentaTotal += costoBebida;
            System.out.println(this.nombre + " ha comprado una bebida. La nueva cuenta es: $" + this.cuentaTotal);
        } else {
            System.out.println("Error: El costo de la bebida debe ser positivo.");
        }
    }

    public void rentarOComprarLibro(double costoLibro, boolean esRenta) {
        if (costoLibro > 0) {
            String tipoTransaccion = esRenta ? "rentado" : "comprado";
            this.cuentaTotal += costoLibro;
            System.out.println(this.nombre + " ha " + tipoTransaccion + " un libro. La nueva cuenta es: $" + this.cuentaTotal);
        } else {
            System.out.println("Error: El costo del libro debe ser positivo.");
        }
    }


    // Opcional pero recomendado: Método toString() para una mejor representación
    public String toString() {
        return "Cliente{" +
               "nombre='" + nombre + '\'' +
               ", correo='" + correo + '\'' +
               ", cuentaTotal=" + cuentaTotal +
               '}';
    }

}