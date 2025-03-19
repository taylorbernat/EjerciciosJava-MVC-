package Modelo;

public class SistemaSeguridad {
    private Sensor[] sensores;
    private boolean esDeNoche;
    private boolean alarmaActivada;

    public SistemaSeguridad() {
        this.sensores = new Sensor[3]; 
        for (int i = 0; i < sensores.length; i++) {
            sensores[i] = new Sensor();
        }
        this.esDeNoche = false;
        this.alarmaActivada = false;
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void verificarSensores() {
        int detecciones = 0;

        for (Sensor sensor : sensores) {
            sensor.detectarMovimiento();
            if (sensor.isActivado()) {
                detecciones+=1;
            }
        }

        if (detecciones >= 2 && esDeNoche) {
            alarmaActivada = true;
        } else {
            alarmaActivada = false;
        }
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }
}
