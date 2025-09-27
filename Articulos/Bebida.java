package Articulos;
public class Bebida{

    private String nombre;
    private String sabor;
    private String tamaño;
    private double precio;
    private String tipo;
    private int cantidad;

    public Bebida(String nombre,String sabor, String tamaño, int precio, String tipo, int cantidad){

        this.nombre=nombre;
        this.sabor=sabor;
        this.tamaño=tamaño;
        this.precio=precio;
        this.tipo=tipo;
        this.cantidad=cantidad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getSabor(){
        return sabor;
    }

    public void setSabor(String sabor){
        this.sabor=sabor;
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

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }


    public void mostrarBebida(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tamaño: "+getTamaño());
        System.out.println("Precio "+getPrecio());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Precio "+getCantidad());
    }
    

}