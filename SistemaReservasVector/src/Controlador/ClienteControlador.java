
package Controlador;

import java.util.Scanner;
import Modelo.Cliente;
import vista.Cine;
public class ClienteControlador extends Persona{
        private Cliente objGuardado;
        private SalaControlador objSala = new SalaControlador();
        public Scanner respuesta = new Scanner(System.in);
        public Cine objCine =  new Cine();

        public ClienteControlador(){
            super();
            this.objGuardado= new Cliente();
        }
        
        public String pedirNombre() {
            return super.pedirNombre();
        }

        public int pedirId() {
            return super.pedirId();
        }

        public String pedirCorreo() {
            return super.pedirCorreo();
            }
        
        
        
        
        
        //----------------Ver------------------
        
        
        public void imprimirInformacion(){
            System.out.println("Nombre:"+super.getNombre());
            System.out.println("Id:"+super.getId());
            System.out.println("Correo:"+super.getCorreo());
        }
        //-----------Guardar Informacion--------------
        public void guardarCliente(){
            String nombreCliente = pedirNombre();
            objGuardado.agregaNombre(nombreCliente);  
            
            int idCliente = pedirId();
            objGuardado.agregaId(idCliente);
            
            String emailCliente = pedirCorreo();
            objGuardado.agregaEmail(emailCliente);
            objGuardado.guardarCliente();
            
            eleccionAsiento();
            
            objGuardado.mostrarClientes();
           
        }
        
        //--------------------------Asientos22681458482-----------------------------------
        
        
        
        public void eleccionAsiento(){
            boolean eleccionCon = true;
            while(eleccionCon){
                int eleccion=objCine.asiento();
                objSala.eleccionSilla(eleccion);
                eleccionCon = objCine.decicion();
                
            }
            
            
        }
    }

