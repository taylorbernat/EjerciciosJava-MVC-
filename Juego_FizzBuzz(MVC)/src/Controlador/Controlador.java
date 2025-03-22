
package Controlador;

import Modelo.Modelo;
import Modelo.Modelo2;
import Vista.Vista;

public class Controlador {
    private Vista vista;
    private Modelo2 modelo2;
    private boolean continuar;

    public Controlador() {
        this.vista = new Vista();
        this.modelo2 = new Modelo2();
        this.continuar = true;
    }

    public void ejecutar() {
        while (continuar) {
            vista.mostrarMensaje("¿Cuantos numeros vas a ingresar?");
            int cantidad = vista.solicitarNumero();

            int[] numeros = new int[cantidad];

            for (int i = 0; i < cantidad; i++) {
                vista.mostrarMensaje("Ingresa el numero " + (i + 1) + ": ");
                numeros[i] = vista.solicitarNumero();
            }

            for (int num : numeros) {
                Modelo numero = new Modelo(num);
                String resultado = numero.obtenerResultado();
                vista.mostrarResultado(num, resultado);
                modelo2.agregarResultado("El resultado para el numero " + num + " es: " + resultado);
            }

            modelo2.mostrarResultados();

            String respuesta = vista.solicitarRespuesta();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }
    }
}
