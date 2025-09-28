package Articulos;
public class Comida {

    private String nombre;
    private String tamaño;
    private double precio;
    private String categoria;
    private int cantidad;
    private int id;
    private static int contador=1;
    public Comida(String nombre, String tamaño, double precio, String categoria, int cantidad){

        this.nombre=nombre;
        this.tamaño=tamaño;
        this.precio=precio;
        this.categoria=categoria;
        this.cantidad=cantidad;
        this.id=contador++;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getTamaño(){
        return tamaño;
    }

    public void setTamaño(String tamaño){
        this.tamaño=tamaño;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(int precio){
        this.precio=precio;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria=categoria;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public int getId()
    {
        return id;
    }
    public boolean decrementarStock() {
        if (this.cantidad > 0) {
            this.cantidad -= 1; 
            return true; 
        }
        return false;
    }

    public void mostrarComida(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tamaño: "+getTamaño());
        System.out.println("Precio "+getPrecio());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Precio "+getCantidad());
        System.out.println("ID: "+ getId());
    }
}
