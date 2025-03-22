package Modelo;

public class AireAcondicionado {
    private boolean encendido;

    public AireAcondicionado() {
        this.encendido = false;
    }

    public void controlar(double temperatura, double humedad) {
        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            encendido = true;
        } else {
            encendido = false;
        }
    }
    
    public void mostrarEstado() {
        if (encendido) {
            System.out.println("El aire acondicionado esta ENCENDIDO.");
        } else {
            System.out.println("El aire acondicionado esta APAGADO.");
        }
    }
    
    public boolean getEncendido() {
        return encendido;
    }
}
