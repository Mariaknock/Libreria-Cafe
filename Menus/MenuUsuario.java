package Menus;
import java.util.ArrayList;
import java.util.Scanner;
import Articulos.*;
import Cliente.*;
import java.util.HashSet;
import java.util.Set;
public class MenuUsuario{
    
    private Scanner scanner =new Scanner(System.in);
    private int opcion, id;
    private double propina;
    private Inventario inventario;
    private String decision, nombre, correo;
    private Set<String> nombres;

    public MenuUsuario(Inventario inventario){
        this.inventario = inventario;
    }
    public void librosRenta(){
        nombres = new HashSet<>();
        for (Libro elemento : inventario.getLibros().values()) {
            nombres.add(elemento.getTituloLibro());
        }
        System.out.println("Libros para rentar: ");
        for (String libro : nombres){
            System.out.println(libro);
        }
    }
    public void mostrarMenuUsuario(){
        ArrayList<Double> precios = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("--- BIENVENIDO AL SERVICIO DE CAFÉ-LIBRERÍA ---");
        System.out.println("¿Cuál es tu nombre? ");
        nombre = scanner.nextLine();
        System.out.println("¿Cuál es tu correo? ");
        correo = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, correo);

        do {    
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Rentar Libro");
            System.out.println("2. Comprar Libro");
            System.out.println("3. Pedir Café/Comida");
            System.out.println("4. Pedir la Cuenta");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    inventario.mostrarLibros();
                    System.out.println("El precio de la renta del libro es de " + Libro.getPrecioRenta());
                    nombres.add("Renta de libro");
                    precios.add(Libro.getPrecioRenta());
                    break;
                case 2:
                    inventario.mostrarLibros();
                    System.out.println("Elige el ID del libro a comprar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    nombres.add(inventario.getLibros().get(id).getTituloLibro());
                    precios.add(inventario.getLibros().get(id).getPrecio());
                    inventario.getLibros().get(id).decrementarStock();
                    break;
                case 3:

                    int opcionCom;
                    do { 
                        
                        System.out.println("--- PEDIR CAFE O COMIDA ---");
                        System.out.println("1) Ver bebidas");
                        System.out.println("2) Ver comidas");
                        System.out.println("3) Regresar al menu");
                        System.out.println("Opcion: ");
                        opcionCom = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcionCom){
                           case 1:
                            System.out.println("--- BEBIDAS EN EXISTENCIA ---");
                            inventario.mostrarBebidas();
                            System.out.println("Ingrese el ID de la bebida que quieres: ");
                            int idBebida= scanner.nextInt();
                            scanner.nextLine();
                            if (inventario.getBebidas().containsKey(idBebida)) {
                                Bebida bebida = inventario.getBebidas().get(idBebida);
                                nombres.add(bebida.getNombre());
                                precios.add(bebida.getPrecio());
                                inventario.getBebidas().get(id).decrementarStock();
                                System.out.println("Bebida agregada al pedido");
                            }else{
                                System.out.println("ID de bebida no valido");
                            }
                            break;
                            case 2:
                            System.out.println("---COMINDAS EN EXISTENCIA ---");
                            inventario.mostrarComidas();
                            System.out.println("Ingrese el ID de la comida que quieres: ");
                            int idComida= scanner.nextInt();
                            scanner.nextLine();
                            if (inventario.getComidas().containsKey(idComida)) {
                                Comida comida = inventario.getComidas().get(idComida);
                                nombres.add(comida.getNombre());
                                precios.add(comida.getPrecio());
                                inventario.getComidas().get(id).decrementarStock();
                                System.out.println("Comida agregada al pedido");
                            }else{
                                System.out.println("ID de comida no valido");
                            }
                            break;
                            case 3:
                            System.out.println("Regresando al menu anterior...");
                            break;
                            default:
                            System.out.println("Opcion no valida");
                        }
                    } while (opcionCom!=3);
                    break;
                case 4:
                    System.out.println("¿Seguro que quiere su orden? El programa saldrá del menú de usuario (s/n)");
                    decision = scanner.nextLine();
                    switch (decision) {
                        case "s":
                            System.out.println("¿Qué valor de propina agregará?");
                            propina = scanner.nextDouble();
                            scanner.nextLine();
                            Cuenta cuenta = new Cuenta(cliente, propina, precios);
                            cuenta.recibo(precios, nombres);
                            opcion = 5;
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion != 5);
    }
}
