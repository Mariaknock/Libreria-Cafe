package Articulos;
public class Comida {

    private String nombre;
    private String tamaño;
    private int precio;
    private String categoria;
    private int cantidad;
    public Comida(String nombre, String tamaño, int precio, String categoria, int cantidad){

        this.nombre=nombre;
        this.tamaño=tamaño;
        this.precio=precio;
        this.categoria=categoria;
        this.cantidad=cantidad;
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

    public int getPrecio(){
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

    public void setCantidad(boolean disponibilidad){
        this.cantidad=cantidad;
    }


    public void mostrarComida(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tamaño: "+getTamaño());
        System.out.println("Precio "+getPrecio());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Precio "+getCantidad());
    }
    
    
}
