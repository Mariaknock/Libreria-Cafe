package Menus;
import Cliente.*;
import Articulos.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
public class MenuAdmin {
    private Scanner scanner = new Scanner(System.in);
    private Inventario inventario;
    private ArrayList<Cliente> clientes=new ArrayList<>();
    private Map<Integer, Libro> libros;
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

    //comida y bebida
    private String nombre;
    private String sabor;
    private String tamaño;
    private String tipo;
    private String categoria;

    public MenuAdmin(Inventario inventario){
        this.inventario = inventario;
        this.libros = inventario.getLibros();
    }
    public void mostrarMenu(){
       login();
       do{
           System.out.println("---- MENU ADMINISTRADOR ----");
           System.out.println("1) Agregar libro");
           System.out.println("2) Modificar o eliminar libro existente");
           System.out.println("3) Registrar cliente de la cafe-libreria");
           System.out.println("4) Consultar informacion de clientes de la cafe-libreria");
           System.out.println("5) Consultar Inventario");
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
                    System.out.printf("%54s %s\n","","----LIBROS EXISTENTES----\n");
                    inventario.mostrarLibros();
                    System.out.printf("\n\n");
                    System.out.printf("%44s %s\n","","----COMIDAS EXISTENTES----\n");
                    inventario.mostrarComidas();
                    System.out.printf("\n\n");
                    System.out.printf("%34s %s\n","","----BEBIDAS EXISTENTES----\n");
                    inventario.mostrarBebidas();
                    System.out.printf("\n\n");
                    break;
                case 6:
                    agregarComida();
                    break;
                case 7:
                    System.out.println("Hasta luego :D");
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

        inventario.mostrarLibros();
        System.out.println("Escoge el ID del libro para modificar");
        idLibro=scanner.nextInt();
        scanner.nextLine();
        if(libros.containsKey(idLibro)){
            do {
                System.out.println("---Modificaciones---");
                System.out.println("1. Numero de páginas");
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
                        System.out.println("Opcion no reconocida.");
                }
            } while (opcion != 5);
        }else{
            System.out.println("ID de libro no valido");
        }
    }

    public void eliminarLibro(Map<Integer, Libro> libros)
    {
        inventario.mostrarLibros();
        System.out.println("Escoge el ID del libro para eliminar");
        idLibro=scanner.nextInt();
        scanner.nextLine();
        if(libros.containsKey(idLibro)){
            if(libros.get(idLibro).decrementarStock()){
                System.out.println(libros.get(idLibro).getTituloLibro()+ " ELIMINADO");
            }else{
            System.out.println(libros.get(idLibro).getTituloLibro()+ " YA NO HAY EN STOCK");
            }  
        }else{
            System.out.println("ID de libro no valido");
        }
    }
    
    public void agregarComida(){
        System.out.println("1) Agregar comida");
        System.out.println("2) Agregar bebida");
        System.out.println("3) Salir");
        opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Nombre de la comida: " );
                nombre = scanner.nextLine();
                System.out.println("Tamaño de la comida: " );
                tamaño = scanner.nextLine();
                System.out.println("Precio de la comida: " );
                precio = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Categoria de la comida: " );
                categoria = scanner.nextLine();
                System.out.println("Cantidad en stock: " );
                cantidad = scanner.nextInt();
                scanner.nextLine();
                Comida nuevaComida = new Comida(nombre, tamaño, precio, categoria, cantidad);
                inventario.agregarComida(nuevaComida);
                break;
            case 2:
                System.out.println("Nombre de la bebida: " );
                nombre = scanner.nextLine();
                System.out.println("Sabor de la bebida: " );
                sabor = scanner.nextLine();
                System.out.println("Tamaño de la bebida: " );
                tamaño = scanner.nextLine();
                System.out.println("Precio de la bebida: " );
                precio = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Categoria de la bebida: " );
                categoria = scanner.nextLine();
                System.out.println("Cantidad en stock: " );
                cantidad = scanner.nextInt();
                scanner.nextLine();
                Bebida nuevBebida = new Bebida(nombre, sabor, tamaño, precio, tipo, cantidad);
                inventario.agregarBebida(nuevBebida);
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion inválida");
                break;
        }
    }
}
