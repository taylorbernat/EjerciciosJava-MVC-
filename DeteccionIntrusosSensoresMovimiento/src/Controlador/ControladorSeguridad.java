package Controlador;

import Modelo.SistemaSeguridad;
import vista.VistaSeguridad;

public class ControladorSeguridad {
    private SistemaSeguridad sistema;
    private VistaSeguridad vista;

    public ControladorSeguridad() {
        sistema = new SistemaSeguridad();
        vista = new VistaSeguridad();
    }

    public void ejecutar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    sistema.setEsDeNoche(true);
                    vista.mostrarMensaje("Modo noche activado.");
                    break;
                case 2:
                    sistema.setEsDeNoche(false);
                    vista.mostrarMensaje("Modo noche desactivado.");
                    break;
                case 3:
                    sistema.verificarSensores();
                    if (sistema.isAlarmaActivada()) {
                        vista.mostrarMensaje("¡ALERTA! Se detectó un intruso.");
                    } else {
                        vista.mostrarMensaje("No hay detección de intrusos.");
                    }
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
