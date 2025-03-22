
package Modelo;

public class Silla {
    boolean disponibilidad; 
    int posicion;
    int munero;
    public Silla(int num){
        this.disponibilidad=true;    
        this.posicion=num;

    }
    
    
    
    public Silla guardarSilla(boolean disponibilidad) {
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.munero = posicion; 
        return this;
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
    
}
