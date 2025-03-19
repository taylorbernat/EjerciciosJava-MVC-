
package Modelo;
import java.util.ArrayList;
public class Cliente {
    
    private  ArrayList<Cliente> listaCliente = new ArrayList<>(); 
    String nombre;
    int id;
    String email;
    public Cliente(){
        this.nombre="";
        this.id = 0;
        this.email = "";

    }
    public void agregaNombre(String nombre){
        this.nombre=nombre;
    }
    public void agregaId(int id){
        this.id=id;
    }
    public void agregaEmail(String email){
        this.email=email;
    }
    public void guardarCliente() {
        listaCliente.add(this);
        System.out.println("Cliente guardado: " + this.nombre);
    }

    public  void mostrarClientes() {
        System.out.println("Lista de clientes guardados:");
        for (Cliente obj : listaCliente ) {
            System.out.println("Nombre: " + obj.nombre + ", ID: " + obj.id + ", Email: " + obj.email);
        }
    }
}
