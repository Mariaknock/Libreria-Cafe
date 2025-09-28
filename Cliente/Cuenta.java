package Cliente;
import java.util.ArrayList;
import java.util.Random;
public class Cuenta{

    private Cliente cliente;
    private double montoTotal;
    private String id;
    private double propina;
    private Random rnd = new Random();
    

    public Cuenta(Cliente cliente, double propina, ArrayList<Double> precios){
        this.id = generarId(rnd);
        this.cliente = cliente;
        this.propina = propina;
        setMontoTotal(precios);
    }
    public Cliente getCliente() {
        return cliente;
    }
    public String getId() {
        return id;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public double getPropina() {
        return propina;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String generarId(Random rnd){
        String id = "";
        for(int i = 0; i <5;i++){
            id += rnd.nextInt(11);
        }
        return id;
    }
    public void setMontoTotal(ArrayList<Double> precios){
        double total= 0;
        for(Double precio:precios){
            total += precio;
        }
        montoTotal = total + propina;
    }
    public void recibo(ArrayList<Double> precios, ArrayList<String> nombres){
        System.out.println("----- RECIBO -----");
        System.out.println("ID de cuenta: " + id);
        System.out.println("Cliente: " + (cliente != null ? cliente.toString() : "N/A"));
        System.out.println("Precios:");
        for (int i = 0; i < precios.size(); i++) {
            System.out.println("  Producto " + nombres.get(i) + ": $" + precios.get(i));
        }
        double subtotal = 0;
        for (Double precio : precios) {
            subtotal += precio;
        }
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Propina: $" + propina);
        System.out.println("Total: $" + montoTotal);
        System.out.println("------------------");
    }
    

}

