import Articulos.Inventario;
<<<<<<< HEAD
import Menus.MenuAdmin;
import Menus.MenuUsuario;
public class Pruebas{
	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		//MenuAdmin menuAdmin=new MenuAdmin(inventario);
		//menuAdmin.mostrarMenu();

		MenuUsuario menuUsuario=new MenuUsuario(inventario);
		menuUsuario.mostrarMenuUsuario();
=======
import Menus.*;
import java.util.Scanner;
public class Pruebas{
	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		Scanner scanner= new Scanner(System.in);
		MenuAdmin menuAdmin=new MenuAdmin(inventario);
		MenuUsuario menuUser=new MenuUsuario(inventario);
		int opcion=0;
		do{
			System.out.println("--BIENVENIDO Al SISTEMA DE LA LIBRERIA-CAFE DE LA FI--");
			System.out.println("1.Menu de administracion");
			System.out.println("2.Menu de Usuario");
			System.out.println("3.Salir");
			System.out.println("Ingrese una opcion");
			opcion=scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
				case 1:
					menuAdmin.mostrarMenu();
					break;
				case 2:
					menuUser.mostrarMenuUsuario();
					break;
				case 3:
					System.out.println("Salio del progrma");
					break;
				default:
					System.out.println("Escoja una opcion valida");
					break;
			}
		}while(opcion!=3);
>>>>>>> 45e0c015a93bd6d5790d77e13150c99b41aecf31
	}
}
