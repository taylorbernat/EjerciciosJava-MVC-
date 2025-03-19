
package Controlador;
    
import Modelo.Silla;
import java.util.Arrays;
import vista.Cine;

public class SalaControlador {
        private Silla sillas;
        public Cine objCine;
    public SalaControlador(){
        this.sillas= new Silla();
        this.objCine= new Cine();
        
    }
   
    
    
    public void eleccionSilla(int seleccion){
        for(int i = 0 ; i<sillas.getLiSillas().length; i++){
            if(seleccion-1==i){
                if(this.sillas.getLiSillas()[i]==null){
                    this.sillas.guardarSilla(i,false);
                }else{
                    if(!this.sillas.getLiSillas()[i].isDisponibilidad()){
                        System.out.println("La silla ya esta ocupada");
                    }
                }
            }
        }  
        for (Silla obj : sillas.getLiSillas()) {
            if (obj != null) { 
            System.out.println("Tomaste la Silla en posicion: " + obj.getPosicion()+1);
            }
        }
    }
    
    
}
