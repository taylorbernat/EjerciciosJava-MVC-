package Controlador;
import Modelo.Sensor;
import Modelo.AireAcondicionado;
import Vista.Interfaz;

public class Controlador {
    private Sensor sensor;
    private AireAcondicionado aire;
    private Interfaz vista;

    public Controlador() {
        this.sensor = new Sensor();
        this.aire = new AireAcondicionado();
        this.vista = new Interfaz();
    }

    public void ejecutar() {
        while (true) {
            sensor.actualizarValores();
            double temp = sensor.getTemperatura();
            double hum = sensor.getHumedad();
            aire.actualizarEstado(temp, hum);

            vista.mostrarMensaje("\n--- Lectura de sensores ---");
            vista.mostrarMensaje("Temperatura: " + temp + "°C");
            vista.mostrarMensaje("Humedad: " + hum + "%");
            vista.mostrarMensaje("Aire Acondicionado: " + (aire.isEncendido() ? "Encendido" : "Apagado"));

            vista.esperarEnter();
        }
    }
}
