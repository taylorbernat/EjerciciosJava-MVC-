
package control_temperatura.mvc;

public class Controlador {
    private Sensor[] sensores;   
    private Estado estadoActual;  
    private Vista vista;          

    public Controlador(int numSensores, Vista vista) {
        this.sensores = new Sensor[numSensores];
        this.vista = vista;
        for (int i = 0; i < numSensores; i++) {
            sensores[i] = new Sensor();  
        }
        this.estadoActual= new Inactivo();  
    }
    
    public void ejecutar() {
        while (true) {
            int temperaturaPromedio = obtenerTemperaturaPromedio();
            vista.mostrarTemperatura(temperaturaPromedio);  

            if (temperaturaPromedio < 10) {
                cambiarEstado(new Calefactor());
            } else if (temperaturaPromedio >= 10 && temperaturaPromedio <= 25) {
                cambiarEstado(new Inactivo());
            } else {
                cambiarEstado(new Ventilador());
            }

            vista.mostrarEstado(estadoActual.getClass().getSimpleName());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private int obtenerTemperaturaPromedio() {
        int temperaturaPromedio = 0;
        for (Sensor sensor : sensores) {
            temperaturaPromedio += sensor.leerTemperatura();
        }
        return temperaturaPromedio / sensores.length;
    }

    private void cambiarEstado(Estado nuevoEstado) {
        if (this.estadoActual != nuevoEstado) {
            this.estadoActual.desactivar();
            this.estadoActual = nuevoEstado;
            this.estadoActual.activar();
        }
    }
}
