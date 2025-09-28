package Articulos;
public class Libro
{
	private String tituloLibro;
	private	int numPaginas;
	private String editorial;
	private String autor;
	private double precio;
	private int cantidad;
	private int id;
	private static int contador=1;
	private static double precioRenta=50;
	//constructor 
	public Libro(String tituloLibro,int numPaginas,String editorial,String autor,double precio, int cantidad)
	{
		this.tituloLibro=tituloLibro;
		this.numPaginas=numPaginas;
		this.editorial=editorial;
		this.autor=autor;
		this.precio=precio;
		this.cantidad=cantidad;
		this.id=contador++;
	}

	// getters y setters
	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(int cantidad)
	{
		this.cantidad=cantidad;
	}
	public int getId(){
		return id;
	}
	public static double getPrecioRenta()
	{
		return precioRenta;
	}

	//metodo para eliminar en stock
	public boolean decrementarStock() {
        if (this.cantidad > 0) {
            this.cantidad -= 1; 
            return true; 
        }
        return false;
    }
	public void mostrarLibro() {
		System.out.println("Titulo: " + getTituloLibro());
		System.out.println("Numero de páginas: " + getNumPaginas());
		System.out.println("Editorial: " + getEditorial());
		System.out.println("Autor: " + getAutor());
		System.out.println("Precio: " + getPrecio());
		System.out.println("ID: " + getId());
		System.out.println("Stock " + getCantidad());
		System.out.println("Precio renta "+ getPrecioRenta());
	}
}