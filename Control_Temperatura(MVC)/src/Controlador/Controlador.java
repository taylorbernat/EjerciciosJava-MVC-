package Controlador;

import Modelo.Calefactor;
import Modelo.Inactivo;
import Modelo.Modelo;
import Modelo.Sensor;
import Modelo.Ventilador;
import Modelo.Modelo2;
import Vista.Vista;

public class Controlador {
    private Sensor[] sensores;
    private Modelo estadoActual;
    private Vista vista;
    private Modelo2 modelo2; 

    public Controlador(int numSensores, Vista vista) {
        this.sensores = new Sensor[numSensores];
        this.vista = vista;
        this.modelo2 = new Modelo2();
        for (int i = 0; i < numSensores; i++) {
            sensores[i] = new Sensor();
        }
        this.estadoActual = new Inactivo();
    }

    public void ejecutar() {
        while (true) {
            int temperaturaPromedio = obtenerTemperaturaPromedio();
            vista.mostrarTemperatura(temperaturaPromedio);

            modelo2.agregarResultado(temperaturaPromedio, estadoActual.getClass().getSimpleName());

            if (temperaturaPromedio < 10) {
                cambiarEstado(new Calefactor());
            } else if (temperaturaPromedio >= 10 && temperaturaPromedio <= 25) {
                cambiarEstado(new Inactivo());
            } else {
                cambiarEstado(new Ventilador());
            }

            vista.mostrarEstado(estadoActual.getClass().getSimpleName());

            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            modelo2.mostrarResultados();
        }
    }

    private int obtenerTemperaturaPromedio() {
        int temperaturaPromedio = 0;
        for (Sensor sensor : sensores) {
            temperaturaPromedio += sensor.leerTemperatura();
        }
        return temperaturaPromedio / sensores.length;
    }

    private void cambiarEstado(Modelo nuevoEstado) {
        if (this.estadoActual != nuevoEstado) {
            this.estadoActual.desactivar(); 
            this.estadoActual = nuevoEstado;
            this.estadoActual.activar();
        }
    }
}
