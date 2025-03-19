
package control_temperatura.mvc;

public class Vista {
    
    public void mostrarTemperatura(int temperatura) {
        System.out.println("Temperatura promedio: " + temperatura + "°C");
    }

    public void mostrarEstado(String estado) {
        System.out.println("Estado actual: " + estado);
    }
}
