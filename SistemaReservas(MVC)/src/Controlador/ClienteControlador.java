
package Controlador;

import java.util.Scanner;
import Modelo.Guardado;
import vista.Cine;
public class ClienteControlador extends Persona{
        private Guardado Clientes;
        private SalaControlador objSala = new SalaControlador();
        public Scanner respuesta = new Scanner(System.in);
        public Cine objCine =  new Cine();

        public ClienteControlador(){
            super();
            this.Clientes = new Guardado();
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
        
        
        
        //-----------Guardar Informacion--------------
        public void guardarCliente(){
            
            String nombreCliente = pedirNombre();   
            int idCliente = pedirId();          
            String emailCliente = pedirCorreo();
            this.Clientes.agregarCliente(nombreCliente, idCliente, emailCliente);
            objCine.mostrarClientes(nombreCliente, idCliente, emailCliente);
            String eleccion= objCine.peliculas();
            eleccionAsiento();
            verTodo(eleccion);
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
        
        public void verTodo(String hola){
            
            objCine.mostrarClientes(this.Clientes.getListaCliente().get(0).getNombre(), this.Clientes.getListaCliente().get(0).getId(),this.Clientes.getListaCliente().get(0).getEmail());
            objSala.imprimirMisSillas();
            System.out.println(hola);
        }
    }

