package Modelo;

public class Sensor {
    private boolean movimiento;

    public Sensor() {
        this.movimiento = false; 
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public boolean hayMovimiento() {
        return movimiento;
    }
}
