package control_temperatura.mvc ;
import  Vista.Vista;
import Controlador.Controlador;

public class ControlTemperaturaMVC {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(5, vista); 
        controlador.ejecutar(); 
    }
}

