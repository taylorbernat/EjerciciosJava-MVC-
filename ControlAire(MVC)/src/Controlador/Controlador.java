package Controlador;

import Vista.Vista;
import Modelo.AireAcondicionado;
import Modelo.Humedad;
import Modelo.Modelo;
import Modelo.Modelo2;

public class Controlador {
    private Vista vista;
    private AireAcondicionado aire;
    private Modelo2 modelo;

    public Controlador() {
        vista = new Vista();
        aire = new AireAcondicionado();
        modelo = new Modelo2();
    }

    public void agregarDatos(double temperatura, double humedad) {
        Modelo temperaturaModelo = new Modelo(temperatura);
        Humedad humedadModelo = new Humedad(humedad);

        aire.controlar(temperatura, humedad);
        String estado = aire.getEncendido() ? "ENCENDIDO" : "APAGADO";

        String resultado = "Temperatura: " + temperaturaModelo.obtenerValor() + "°C, " +
                "Humedad: " + humedadModelo.obtenerValor() + "%, " +
                "Aire acondicionado: " + estado;
        
        modelo.agregarResultado(resultado);
    }

    public void ejecutar() {
        vista.mostrarMensajeBienvenida();

        boolean continuar = true;
        while (continuar) {
            double temperatura = vista.pedirTemperatura();
            double humedad = vista.pedirHumedad();

            agregarDatos(temperatura, humedad);

            aire.mostrarEstado();

            continuar = vista.deseaContinuar();
        }

        modelo.mostrarResultados();
        vista.mostrarMensajeFin();
    }
}
