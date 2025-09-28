import Articulos.Inventario;
import Menus.MenuAdmin;
import Menus.MenuUsuario;
public class Pruebas{
	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		//MenuAdmin menuAdmin=new MenuAdmin(inventario);
		//menuAdmin.mostrarMenu();

		MenuUsuario menuUsuario=new MenuUsuario(inventario);
		menuUsuario.mostrarMenuUsuario();
	}
}
