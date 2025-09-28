package Articulos;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Inventario{

	private Map<Integer, Libro> libros=new HashMap<>();
	private Set<Comida> comidas=new HashSet<>();
	private Set<Bebida> bebidas=new HashSet<>();

	public Inventario()
    {
        //libros
        Libro l1 = new Libro("Cien años de soledad", 496, "Sudamericana", "Gabriel García Márquez", 250.50, 10);
        Libro l2 = new Libro("El principito", 96, "Salamandra", "Antoine de Saint-Exupéry", 150.00, 25);
        Libro l3 = new Libro("1984", 328, "Debolsillo", "George Orwell", 180.75, 15);
        Libro l4 = new Libro("Don Quijote de la Mancha", 1072, "Edebé", "Miguel de Cervantes", 300.00, 5);
        Libro l5 = new Libro("El señor de los anillos", 1216, "Minotauro", "J.R.R. Tolkien", 450.20, 8);
        Libro l6 = new Libro("Orgullo y prejuicio", 432, "Penguin Clásicos", "Jane Austen", 125.00, 20);
        Libro l7 = new Libro("Crónica de una muerte anunciada", 128, "Diana", "Gabriel García Márquez", 140.00, 12);
        Libro l8 = new Libro("La sombra del viento", 574, "Planeta", "Carlos Ruiz Zafón", 220.50, 18);
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

        Comida c1 = new Comida("Sandwich de jamón", "grande", 55, "Sandwich", 20);
        Comida c2 = new Comida("Ensalada César", "mediano", 70, "Ensalada", 15);
        Comida c3 = new Comida("Pastel de chocolate", "chico", 45, "Postre", 30);
        Comida c4 = new Comida("Galletas de avena", "chico", 20, "Postre", 50);
        Comida c5 = new Comida("Sopa de lentejas", "mediano", 60, "Sopa", 10);
        Comida c6 = new Comida("Sandwich de pollo", "grande", 65, "Sandwich", 18);
        Comida c7 = new Comida("Pay de queso", "chico", 50, "Postre", 25);
        Comida c8 = new Comida("Yogur con granola", "chico", 40, "Postre", 40);
        Comida c9 = new Comida("Ensalada de frutas", "mediano", 55, "Ensalada", 12);
        Comida c10 = new Comida("Sandwich de Huevo", "grande", 55, "Sandwich", 15);

        this.comidas.add(c1);
        this.comidas.add(c2);
        this.comidas.add(c3);
        this.comidas.add(c4);
        this.comidas.add(c5);
        this.comidas.add(c6);
        this.comidas.add(c7);
        this.comidas.add(c8);
        this.comidas.add(c9);
        this.comidas.add(c10);

        Bebida b1 = new Bebida("Café Americano", "Expresso", "mediano", 35, "Caliente", 50);
        Bebida b2 = new Bebida("Té Helado", "Limón", "grande", 40, "Frío", 40);
        Bebida b3 = new Bebida("Jugo de Naranja", "Naranja", "chico", 45, "Frío", 30);
        Bebida b4 = new Bebida("Capuchino", "Leche", "mediano", 40, "Caliente", 60);
        Bebida b5 = new Bebida("Refresco", "Cola", "grande", 30, "Frío", 70);
        Bebida b6 = new Bebida("Chocolate Caliente", "Chocolate", "mediano", 45, "Caliente", 35);
        Bebida b7 = new Bebida("Té Verde", "Verde", "chico", 30, "Caliente", 45);
        Bebida b8 = new Bebida("Limonada", "Limón", "grande", 35, "Frío", 55);
        Bebida b9 = new Bebida("Mokachino", "Moka", "mediano", 35, "Caliente", 20);
        Bebida b10 = new Bebida("Jugo de Manzana", "Manzana", "chico", 45, "Frío", 25);

        this.bebidas.add(b1);
        this.bebidas.add(b2);
        this.bebidas.add(b3);
        this.bebidas.add(b4);
        this.bebidas.add(b5);
        this.bebidas.add(b6);
        this.bebidas.add(b7);
        this.bebidas.add(b8);
        this.bebidas.add(b9);
        this.bebidas.add(b10);
    }

    //termina contructor


    //getters de Inventario
    public Map<Integer, Libro> getLibros() {
        return this.libros;
    }

    public Set<Comida> getComidas() {
        return this.comidas;
    }
    
    public Set<Bebida> getBebidas() {
        return this.bebidas;
    }
    
    //////
    public void agregarComida(Comida comida){
        this.comidas.add(comida);
    }
    public void agregarLibro(Libro libro){
        this.libros.put(libro.getId(), libro);
    }
    public void agregarBebida(Bebida bebida){
        this.bebidas.add(bebida);
    }

    public void eliminarComida(String nombre){
        this.comidas.removeIf(comida -> comida.getNombre().equals(nombre));
    }
    public void eliminarLibro(int id){
        this.libros.remove(id);
    }
    public void eliminarBebida(String nombre){
        this.bebidas.removeIf(bebida -> bebida.getNombre().equals(nombre));
    }
    
    public void mostrarLibros()
    {
        System.out.printf("%-35s %-10s\n", "TÍTULO DEL LIBRO", "ID DEL LIBRO");
        for (int i=1; i<=libros.size(); i++)
            System.out.printf("%-35s %-10d\n",libros.get(i).getTituloLibro(),libros.get(i).getId());
    }
}
    







    