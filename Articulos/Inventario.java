package Articulos;
import java.util.HashMap;
import java.util.Map;

public class Inventario{

	private Map<Integer, Libro> libros=new HashMap<>();
	private Map<Integer, Comida> comidas=new HashMap<>();
	private Map<Integer, Bebida> bebidas=new HashMap<>();

	public Inventario()
    {
        //libros
        Libro l1 = new Libro("Cien años de soledad", 496, "Sudamericana", "Gabriel Garcia Márquez", 250.50, 10);
        Libro l2 = new Libro("El principito", 96, "Salamandra", "Antoine de Saint-Exupery", 150.00, 25);
        Libro l3 = new Libro("1984", 328, "Debolsillo", "George Orwell", 180.75, 15);
        Libro l4 = new Libro("Don Quijote de la Mancha", 1072, "Edebe", "Miguel de Cervantes", 300.00, 5);
        Libro l5 = new Libro("El señor de los anillos", 1216, "Minotauro", "J.R.R. Tolkien", 450.20, 8);
        Libro l6 = new Libro("Orgullo y prejuicio", 432, "Penguin Clasicos", "Jane Austen", 125.00, 20);
        Libro l7 = new Libro("Cronica de una muerte anunciada", 128, "Diana", "Gabriel Garcia Márquez", 140.00, 12);
        Libro l8 = new Libro("La sombra del viento", 574, "Planeta", "Carlos Ruiz Zafon", 220.50, 18);
        Libro l9 = new Libro("Fahrenheit 451", 208, "Minotauro", "Ray Bradbury", 160.00, 10);
        Libro l10 = new Libro("Harry Potter", 256, "Salamandra", "J.K. Rowling", 280.00, 30);

        this.libros.put(l1.getId(), l1);
        this.libros.put(l2.getId(), l2);
        this.libros.put(l3.getId(), l3);
        this.libros.put(l4.getId(), l4);
        this.libros.put(l5.getId(), l5);
        this.libros.put(l6.getId(), l6);
        this.libros.put(l7.getId(), l7);
        this.libros.put(l8.getId(), l8);
        this.libros.put(l9.getId(), l9);
        this.libros.put(l10.getId(), l10);

        Comida c1 = new Comida("Sandwich de jamon", "grande", 55, "Sandwich", 20);
        Comida c2 = new Comida("Ensalada Cesar", "mediano", 70, "Ensalada", 15);
        Comida c3 = new Comida("Pastel de chocolate", "chico", 45, "Postre", 30);
        Comida c4 = new Comida("Galletas de avena", "chico", 20, "Postre", 50);
        Comida c5 = new Comida("Sopa de lentejas", "mediano", 60, "Sopa", 10);
        Comida c6 = new Comida("Sandwich de pollo", "grande", 65, "Sandwich", 18);
        Comida c7 = new Comida("Pay de queso", "chico", 50, "Postre", 25);
        Comida c8 = new Comida("Yogur con granola", "chico", 40, "Postre", 40);
        Comida c9 = new Comida("Ensalada de frutas", "mediano", 55, "Ensalada", 12);
        Comida c10 = new Comida("Sandwich de Huevo", "grande", 55, "Sandwich", 15);

        this.comidas.put(c1.getId(), c1);
        this.comidas.put(c2.getId(), c2);  
        this.comidas.put(c3.getId(), c3);
        this.comidas.put(c4.getId(), c4);
        this.comidas.put(c5.getId(), c5);
        this.comidas.put(c6.getId(), c6);
        this.comidas.put(c7.getId(), c7);
        this.comidas.put(c8.getId(), c8);
        this.comidas.put(c9.getId(), c9);
        this.comidas.put(c10.getId(), c10);

        Bebida b1 = new Bebida("Cafe Americano", "Expresso", "mediano", 35, "Caliente", 50);
        Bebida b2 = new Bebida("Te Helado", "Limon", "grande", 40, "Frio", 40);
        Bebida b3 = new Bebida("Jugo de Naranja", "Naranja", "chico", 45, "Frio", 30);
        Bebida b4 = new Bebida("Capuchino", "Leche", "mediano", 40, "Caliente", 60);
        Bebida b5 = new Bebida("Refresco", "Cola", "grande", 30, "Frio", 70);
        Bebida b6 = new Bebida("Chocolate Caliente", "Chocolate", "mediano", 45, "Caliente", 35);
        Bebida b7 = new Bebida("Te Verde", "Verde", "chico", 30, "Caliente", 45);
        Bebida b8 = new Bebida("Limonada", "Limon", "grande", 35, "Frio", 55);
        Bebida b9 = new Bebida("Mokachino", "Moka", "mediano", 35, "Caliente", 20);
        Bebida b10 = new Bebida("Jugo de Manzana", "Manzana", "chico", 45, "Frio", 25);

        this.bebidas.put(b1.getId(), b1);
        this.bebidas.put(b2.getId(), b2);
        this.bebidas.put(b3.getId(), b3);
        this.bebidas.put(b4.getId(), b4);
        this.bebidas.put(b5.getId(), b5);
        this.bebidas.put(b6.getId(), b6);
        this.bebidas.put(b7.getId(), b7);
        this.bebidas.put(b8.getId(), b8);
        this.bebidas.put(b9.getId(), b9);
        this.bebidas.put(b10.getId(), b10);
    }

    //termina contructor


    //getters de Inventario
    public Map<Integer, Libro> getLibros() {
        return this.libros;
    }

    public Map<Integer, Comida> getComidas() {
        return this.comidas;
    }
    
    public Map<Integer, Bebida> getBebidas() {
        return this.bebidas;
    }
    
    //////
    public void agregarComida(Comida comida){
        this.comidas.put(comida.getId(),comida);
    }
    public void agregarLibro(Libro libro){
        this.libros.put(libro.getId(), libro);
    }
    public void agregarBebida(Bebida bebida){
        this.bebidas.put(bebida.getId(),bebida);
    }

    public void mostrarLibros()
    {
       System.out.printf("%-40s %-5s %-12s %-12s %-20s %-30s %-5s\n", "TITULO","ID","PRECIO","NUM.PAGINAS","EDITORIAL","AUTOR","STOCK");
        for (int i = 1; i <= libros.size(); i++) {
            System.out.printf("%-40s %-5d %-12.2f %-12d %-20s %-30s %-5d\n",
            libros.get(i).getTituloLibro(),     
            libros.get(i).getId(),              
            libros.get(i).getPrecio(),          
            libros.get(i).getNumPaginas(),      
            libros.get(i).getEditorial(),       
            libros.get(i).getAutor(),           
            libros.get(i).getCantidad()            
            );
        } 
    }

    public void mostrarComidas()
    {
        System.out.printf("%-35s %-10s %-13s %-13s %-13s %-13s\n", "COMIDA","ID","PRECIO","TAMAÑO","CATEGORIA","STOCK");
        for (int i = 1; i <= comidas.size(); i++) {
            System.out.printf("%-35s %-10d %-13.2f %-13s %-13s %-13d\n",
                comidas.get(i).getNombre(),        
                comidas.get(i).getId(),             
                comidas.get(i).getPrecio(),         
                comidas.get(i).getTamaño(),         
                comidas.get(i).getCategoria(),      
                comidas.get(i).getCantidad()        
            );
        }
    }

     public void mostrarBebidas()
    {
        System.out.printf("%-35s %-10s %-13s %-13s %-13s\n", "BEBIDA","ID","PRECIO","TAMAÑO","STOCK");
        for (int i = 1; i <= bebidas.size(); i++) {
            System.out.printf("%-35s %-10d %-13.2f %-13s %-13d\n",
                bebidas.get(i).getNombre(),        
                bebidas.get(i).getId(),             
                bebidas.get(i).getPrecio(),         
                bebidas.get(i).getTamaño(),         
                bebidas.get(i).getCantidad()        
            );
        }
            
    }
}
    







    