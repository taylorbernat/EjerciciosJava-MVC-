package Controlador;

import Modelo.Sensor;
import Vista.Vista;

public class Controlador {
    private Sensor[] sensores; 
    private boolean esDeNoche;
    private Vista vista;

    public Controlador(int numHabitaciones) {
        this.sensores = new Sensor[numHabitaciones];
        for (int i = 0; i < numHabitaciones; i++) {
            this.sensores[i] = new Sensor(); 
        }
        this.esDeNoche = false; 
        this.vista = new Vista();
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void detectarMovimiento(int habitacion, boolean movimiento) {
        if (habitacion >= 0 && habitacion < sensores.length) {
            sensores[habitacion].setMovimiento(movimiento);
        }
    }

    public void actualizarLuces() {
        boolean hayMovimiento = false;
        
      
        for (Sensor sensor : sensores) {
            if (sensor.hayMovimiento()) {
                hayMovimiento = true;
                break;
            }
        }

        boolean lucesEncendidas = esDeNoche && hayMovimiento;
        vista.mostrarEstadoLuces(lucesEncendidas);
    }
}
