package Modelo;

public class Tienda {
    private boolean horarioAtencion;

    public Tienda(boolean horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public void setHorarioAtencion(boolean horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public boolean verificarAcceso(Persona persona) {
        return persona.esEmpleado() || (persona.tieneMembresia() && horarioAtencion);
    }
}
