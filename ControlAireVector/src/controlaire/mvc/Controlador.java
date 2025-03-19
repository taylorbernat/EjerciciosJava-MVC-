
package controlaire.mvc;

public class Controlador {
    private Vista vista;
    private AireAcondicionado aire;
    private Modelo[] temperaturas;
    private Humedad[] humedades;
    private int cantidadDatos;

    public Controlador() {
        vista = new Vista();
        aire = new AireAcondicionado();
        temperaturas = new Modelo[10]; 
        humedades = new Humedad[10]; 
        cantidadDatos = 0;
    }

    public void agregarDatos(double temperatura, double humedad) {
        if (cantidadDatos < temperaturas.length) {
            temperaturas[cantidadDatos] = new Modelo(temperatura);
            humedades[cantidadDatos] = new Humedad(humedad);
            cantidadDatos++;
        } else {
            System.out.println("Se ha alcanzado el límite de datos.");
        }
    }

    public void ejecutar() {
        vista.mostrarMensajeBienvenida();

        boolean continuar = true;
        while (continuar) {
            double temperatura = vista.pedirTemperatura();
            double humedad = vista.pedirHumedad();

            agregarDatos(temperatura, humedad);

            aire.controlar(temperaturas[cantidadDatos - 1], humedades[cantidadDatos - 1]);
            aire.mostrarEstado();

            continuar = vista.deseaContinuar();
        }

        vista.mostrarMensajeFin();
    }

    }
