package Menus;
import Cliente.*;
import Articulos.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
public class menuadmin {
    private Scanner scanner = new Scanner(System.in);
    private Inventario inventario=new Inventario();
    private ArrayList<Cliente> clientes=new ArrayList<>();
    private Map<Integer, Libro> libros = inventario.getLibros();
    private int claveAcceso=1234;
    private int numero;
    private int opcion;
    private int idLibro;

    //libros
    private String tituloLibro;
    private int numPaginas;
    private String editorial;
    private String autor;
    private double precio;
    private int cantidad;

    //clientes
    private String nombreCliente;
    private String correoCliente;

    //comida
    private String nombre;
    private String sabor;
    private String tamaño;
    private String tipo;
    private String categoria;

    
    public void mostrarMenu(){
       login();
       do{
           System.out.println("---- MENU ADMINISTRADOR ----");
           System.out.println("1) Agregar libro");
           System.out.println("2) Modificar o eliminar libro existente");
           System.out.println("3) Registrar cliente de la cafe-libreria");
           System.out.println("4) Consultar informacion de clientes de la cafe-libreria");
           System.out.println("5) Consultar libros existentes");
           System.out.println("6) Agregar Comida - Bebida");
           System.out.println("7) Salir ");
           opcion=scanner.nextInt();
           scanner.nextLine();
           switch(opcion){
                case 1:
                    System.out.println("Ingrese el titulo del libro");
                    tituloLibro=scanner.nextLine();
                    System.out.println("Ingrese el numero de paginas del libro");
                    numPaginas=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese la editorial");
                    editorial=scanner.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    autor=scanner.nextLine();
                    System.out.println("Ingrese el precio del libro");
                    precio=scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese cuantos libros se agregan");
                    cantidad=scanner.nextInt();
                    scanner.nextLine();
                    Libro nuevoLibro=new Libro(tituloLibro,numPaginas,editorial,autor,precio,cantidad);
                    inventario.agregarLibro(nuevoLibro);
                    break;
                case 2:
                    System.out.println("1.Modificar libro");
                    System.out.println("2.Eliminar libro");
                    System.out.println("Escoja una opcion:");
                    opcion=scanner.nextInt();
                    scanner.nextLine();
                    if(opcion==1){
                        modificarLibro(libros);
                    }
                    if(opcion==2){
                        eliminarLibro(libros);
                    }else
                    {
                        System.out.println("Escoja una opcion valida");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del cliente: ");
                    nombreCliente = scanner.nextLine();
                    System.out.println("Ingrese el correo del cliente: ");
                    correoCliente = scanner.nextLine();

                    Cliente nuevoCliente = new Cliente(nombreCliente, correoCliente);
                    clientes.add(nuevoCliente);
                    System.out.println("Cliente registrado");
                    break;
                case 4:
                    if(clientes.isEmpty()){
                        System.out.println("No hay clientes existentes");
                    }else{
                    System.out.printf("%-5s %-25s %-30s\n", "ID", "NOMBRE", "CORREO");
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente c = clientes.get(i);
                        System.out.printf("%-5d %-25s %-30s\n", c.getId(), c.getNombre(), c.getCorreo());
                    }
                }
                    break;
                case 5:
                    System.out.printf("%-35s %-10s %-15s\n", "TÍTULO DEL LIBRO", "ID LIBRO","STOCK");
                    for (int i=1; i<=inventario.getLibros().size(); i++)
                        System.out.printf("%-35s %-10d %-15d\n",libros.get(i).getTituloLibro(),libros.get(i).getId(),libros.get(i).getCantidad());
                    System.out.println("Ingrese el ID del libro para mostrar sus especificaciones");
                    idLibro=scanner.nextInt();
                    scanner.nextLine();
                    libros.get(idLibro).mostrarLibro();
                    break;
                case 6:

                    break;
                default:
                    System.out.println("Escoja una opcion valida");
           }

       }while(opcion!=7);
    }

    public void login(){

       do{
       System.out.println("Ingresa la contraseña para ingresar al menu ");
       numero= scanner.nextInt();
       if(numero!=claveAcceso)
            System.out.println("La clave no coincide, intenta de nuevo");
       }while(numero!=claveAcceso);
    }

    public void modificarLibro(Map<Integer, Libro> libros)
    {
        System.out.printf("%-35s %-10s\n", "TÍTULO DEL LIBRO", "ID DEL LIBRO");
        for (int i=1; i<=inventario.getLibros().size(); i++)
            System.out.printf("%-35s %-10d\n",libros.get(i).getTituloLibro(),libros.get(i).getId());
        System.out.println("!Escoge el ID del libro para modificar");
        idLibro=scanner.nextInt();
        scanner.nextLine();
        do {
            System.out.println("---Modificaciones---");
            System.out.println("1. Número de páginas");
            System.out.println("2. Editorial");
            System.out.println("3. Precio");
            System.out.println("4. Cantidad (Stock)");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion=scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo numero de paginas del libro");
                    numPaginas=scanner.nextInt();
                    scanner.nextLine();
                    libros.get(idLibro).setNumPaginas(numPaginas);
                    break; 
                case 2:
                    System.out.println("Ingrese la nueva editorial");
                    editorial=scanner.nextLine();
                    libros.get(idLibro).setEditorial(editorial);
                    break; 
                case 3:
                    System.out.println("Ingrese el nuevo precio del libro");
                    precio=scanner.nextDouble();
                    scanner.nextLine();
                    libros.get(idLibro).setPrecio(precio);
                    break; 
                case 4:
                    System.out.println("Ingrese la nueva cantidad de libros");
                    cantidad=scanner.nextInt();
                    scanner.nextLine();
                    libros.get(idLibro).setCantidad(cantidad);
                    break;  
                case 5:
                    System.out.println("Saliendo del gestor de modificaciones");
                    break;
                default:
                    System.out.println("Opción no reconocida.");
            }
        } while (opcion != 5);
    }

    public void eliminarLibro(Map<Integer, Libro> libros)
    {
        System.out.printf("%-35s %-10s\n", "TÍTULO DEL LIBRO", "ID DEL LIBRO");
        for (int i=1; i<=inventario.getLibros().size(); i++)
            System.out.printf("%-35s %-10d\n",libros.get(i).getTituloLibro(),libros.get(i).getId());
        System.out.println("Escoge el ID del libro para eliminar");
        idLibro=scanner.nextInt();
        scanner.nextLine();
        if(libros.get(idLibro).decrementarStock()){
            System.out.println(libros.get(idLibro).getTituloLibro()+ " ELIMINADO");
        }else{
            System.out.println(libros.get(idLibro).getTituloLibro()+ " YA NO HAY EN STOCK");
        }
    }
    
    public void agregarComida(){
        System.out.println("1) Agregar comida");
        System.out.println("2) Agregar bebida");
        System.out.println("3) Agregar comida");

        opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Nombre de la comida: " );
                nombre = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Tamaño de la comida: " );
                tamaño = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Precio de la comida: " );
                precio = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Categoría de la comida: " );
                categoria = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Cantidad en stock: " );
                cantidad = scanner.nextInt();
                scanner.nextLine();
                
                break;
        
            default:
                break;
        }

        
    }
}
