package Modelo;

public class AireAcondicionado {
    private boolean encendido;

    public AireAcondicionado() {
        this.encendido = false;
    }

    public void actualizarEstado(double temperatura, double humedad) {
        if (temperatura > 28 && humedad > 60 || temperatura > 30) {
            encendido = true;
        } else {
            encendido = false;
        }
    }

    public boolean isEncendido() {
        return encendido;
    }
}
    