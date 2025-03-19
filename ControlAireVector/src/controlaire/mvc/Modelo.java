
package controlaire.mvc;


class Modelo {
    private double valor;

    public Modelo(double valor) {
        this.valor = valor;
    }

    public double obtenerValor() {
        return valor;
    }
}


class Humedad {
    private double valor;

    public Humedad(double valor) {
        this.valor = valor;
    }

    public double obtenerValor() {
        return valor;
    }
}

class AireAcondicionado {
    private boolean encendido;

    public AireAcondicionado() {
        this.encendido = false;
    }

    public void controlar(Modelo temp, Humedad hum) {
        if ((temp.obtenerValor() > 28 && hum.obtenerValor() > 60) || temp.obtenerValor() > 30) {
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
}
