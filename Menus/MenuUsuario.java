package Menus;
import java.util.Scanner;
public class MenuUsuario{
    
    private Scanner scanner =new Scanner(System.in);
    private int opcion;
    
    public void mostrarMenuUsuario(){
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
                    break;
                case 2:
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
