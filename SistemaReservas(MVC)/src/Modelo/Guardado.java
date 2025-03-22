
package Modelo;
import java.util.ArrayList;
public class Guardado {
    private ArrayList<Cliente> listaCliente;
    private Silla[] listaSalas;
    public Guardado(){
        this.listaSalas = new Silla[20];
        this.listaCliente= new ArrayList<Cliente>();
        
        for (int i = 0; i < listaSalas.length; i++) {
            listaSalas[i] = new Silla(i+1);
        }
                
    }
    //------------------------------Sillas------------------------------
    public void guardarSilla(int numero){
        
        for(int i = 0 ;  i < listaSalas.length; i++){
            if(numero-1 ==i){
                if(listaSalas[i].isDisponibilidad()){
                    Silla objSilla = new Silla(i+1);
                    listaSalas[i]=objSilla.guardarSilla(false);
                }
                
            }
        } 
    }
    
    public void imprimirInformacion(){
    
        for (Silla objSilla : listaSalas) {
            if(objSilla.isDisponibilidad()){
                System.out.println("Los asientos reservados son"+objSilla.getMunero());
                
            }
        }
    
    }
    public Silla[] getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(Silla[] listaSalas) {
        this.listaSalas = listaSalas;
    }
    
    //------------------------------Cliente------------------------------

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    
    public void agregarCliente(String nombre,int id,String email){
        listaCliente.add(new Cliente());


        Cliente ultimoCliente = listaCliente.get(listaCliente.size() - 1);
        ultimoCliente.agregaNombre(nombre);
        ultimoCliente.agregaId(id);
        ultimoCliente.agregaEmail(email);

        
    
    }
    
    
}
 