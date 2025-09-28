package Menus;
import java.util.ArrayList;
import java.util.Scanner;
import Articulos.*;
public class MenuUsuario{
    
    private Scanner scanner =new Scanner(System.in);
    private int opcion, id;
    private Inventario inventario;

    public MenuUsuario(Inventario inventario){
        this.inventario = inventario;
    }
    public void mostrarMenuUsuario(){
        ArrayList<Double> precios = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        do {
            System.out.println("--- BIENVENIDO AL SERVICIO DE CAFÉ-LIBRERÍA ---");
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
                    System.out.println("El precio de la renta del libro es de " + Libro.getPrecioRenta());
                    nombres.add("Renta de libro");
                    precios.add(Libro.getPrecioRenta());
                    break;
                case 2:
                    System.out.println("Elige el ID del libro a comprar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    nombres.add("");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
