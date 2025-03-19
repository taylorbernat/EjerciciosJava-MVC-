package Controlador;
import Modelo.Persona;
import Modelo.Tienda;
import Vista.Interfaz;

public class Controlador {
    private Tienda tienda;
    private Interfaz vista;

    public Controlador() {
        this.tienda = new Tienda(true);
        this.vista = new Interfaz();
    }

    public void ejecutar() {
        while (true) {
            boolean horario = vista.solicitarBooleano("¿La tienda está en horario de atención?");
            tienda.setHorarioAtencion(horario);

            boolean tieneMembresia = vista.solicitarBooleano("¿El cliente tiene membresía?");
            boolean esEmpleado = vista.solicitarBooleano("¿El cliente es empleado?");
            Persona persona = new Persona(tieneMembresia, esEmpleado);

            boolean acceso = tienda.verificarAcceso(persona);
            vista.mostrarMensaje("\nAcceso " + (acceso ? "PERMITIDO " : "DENEGADO ") + "\n");
        }
    }
}
