package Controlador;
import Modelo.Guardado;
import vista.Cine;
import Modelo.Silla;
public class SalaControlador {
        private Guardado sillas;
        public Cine objCine;
    public SalaControlador(){
        this.sillas= new Guardado();
        this.objCine= new Cine();
        
    }
    public void eleccionSilla(int seleccion){
        for(int i = 0 ; i<sillas.getListaSalas().length; i++){
            if(seleccion-1==i){
                if(this.sillas.getListaSalas()[i].isDisponibilidad()){
                    this.sillas.guardarSilla(seleccion);
                    objCine.Confirmacion(this.sillas.getListaSalas()[i].getPosicion());
                    
                }
            }
        }  
        if(objCine.verAsientosDiponibles()){    
            imprimirSillas();
        }
    }
        
    public void imprimirSillas(){
        for(Silla obj : this.sillas.getListaSalas()){
            
            objCine.imprimirSillas(obj.getPosicion(), obj.isDisponibilidad());
        
        }
        
    }
    
    public void imprimirMisSillas(){
        for(Silla obj : this.sillas.getListaSalas()){
            if(!obj.isDisponibilidad()){
                objCine.imprimirMisSillas(obj.getPosicion());
            }
        
        }
    }

   
    
    
}
