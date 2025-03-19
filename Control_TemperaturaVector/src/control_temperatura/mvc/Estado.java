
package control_temperatura.mvc;
import java.util.Random;

class Sensor {
    private Random random;

    public Sensor() {
        this.random = new Random();
    }

    public int leerTemperatura() {
        return random.nextInt(40);
    }
}


 public class Estado {
    public void activar(){
}
 
    public void desactivar(){
}
 }


class Calefactor extends Estado {
    public void activar() {
        System.out.println("El calefactor esta activado.");
    }

    public void desactivar() {
        System.out.println("El calefactor esta desactivado.");
    }
}

class Ventilador extends Estado {
    public void activar() {
        System.out.println("El ventilador esta activado.");
    }

    public void desactivar() {
        System.out.println("El ventilador esta desactivado.");
    }
}

class Inactivo extends Estado {
    public void activar() {
        System.out.println("El sistema esta inactivo.");
    }

    public void desactivar() {
        System.out.println("El sistema sigue inactivo.");
    }
}
