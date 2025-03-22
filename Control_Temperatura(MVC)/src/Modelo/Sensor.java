package Modelo;

import java.util.Random;

public class Sensor {
    private Random random;

    public Sensor() {
        this.random = new Random();
    }

    public int leerTemperatura() {
        return random.nextInt(40);
    }
}
