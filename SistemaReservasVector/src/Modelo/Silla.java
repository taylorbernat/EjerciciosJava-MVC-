
package Modelo;

public class Silla {
    private Silla[] liSillas;
    boolean disponibilidad; 
    int posicion;
    int munero;
    public Silla(){
        this.disponibilidad=true;    
        this.posicion=0;
        this.liSillas = new Silla[20];

    }
    
    public void AsignarSilla(){
        if(!this.disponibilidad){
            System.out.println("Ese asiento ya esta ocupado");
        }else{
            this.disponibilidad=false;
            
        }
        
    
    }
    
    
    public  void guardarSilla(int posicion, boolean diponi){
        Silla objSilla = new Silla();
        objSilla.setDisponibilidad(diponi);
        objSilla.setPosicion(posicion);
        
        this.liSillas[posicion]=objSilla;
        
    
    
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getMunero() {
        return munero;
    }

    public void setMunero(int munero) {
        this.munero = munero;
    }

    public Silla[] getLiSillas() {
        return liSillas;
    }

    public void setLiSillas(Silla[] liSillas) {
        this.liSillas = liSillas;
    }
    
    
}
