
package juego_fizzbuzz.mvc;

public class Controlador {
    private Vista vista;
    private boolean continuar;

    public Controlador() {
        this.vista = new Vista();
        this.continuar = true;
    }

    public void ejecutar() {
        while (continuar) {
       
            vista.mostrarMensaje("¿Cuantos numeros quieres ingresar?");
            int cantidad = vista.solicitarNumero();
            
            int[] numeros = new int[cantidad];

            for (int i = 0; i < cantidad; i++) {
                vista.mostrarMensaje("Ingresa el numero " + (i + 1) + ": ");
                numeros[i] = vista.solicitarNumero();
            }

            for (int num : numeros) {
                Numero numero = new Numero(num);
                String resultado = numero.obtenerResultado();
                vista.mostrarResultado(num, resultado);
            }

            String respuesta = vista.solicitarRespuesta();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }
    }
}

