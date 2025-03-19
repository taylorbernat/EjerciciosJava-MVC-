package Modelo;
import java.util.Random;

public class Sensor {
    private double temperatura;
    private double humedad;
    private Random random = new Random();

    public Sensor() {
        actualizarValores();
    }

    public void actualizarValores() {
        this.temperatura = 25 + random.nextDouble() * 10; 
        this.humedad = 50 + random.nextDouble() * 50; 
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }
}
