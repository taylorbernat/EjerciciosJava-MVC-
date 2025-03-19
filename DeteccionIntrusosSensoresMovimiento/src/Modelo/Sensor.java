
package Modelo;


import java.util.Random;

public class Sensor {
    private boolean activado;

    public Sensor() {
        this.activado = false;
    }

    public void detectarMovimiento() {
        Random rand = new Random();
        this.activado = rand.nextBoolean(); 
    }

    public boolean isActivado() {
        return activado;
    }
}