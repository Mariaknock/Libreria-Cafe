import Articulos.Inventario;
import Menus.MenuAdmin;
public class Pruebas{
	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		MenuAdmin menuAdmin=new MenuAdmin(inventario);
		menuAdmin.mostrarMenu();
	}
}
