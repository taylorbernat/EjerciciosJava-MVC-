
package control_temperatura.mvc;


public class Control_TemperaturaMVC {
    public static void main(String[] args) {
        Vista vista = new Vista(); 
        Controlador controlador = new Controlador(5, vista); 
        controlador.ejecutar(); 
    }
}
