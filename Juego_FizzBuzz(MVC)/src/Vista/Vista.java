package Vista;
import java.util.Scanner;

public class Vista {

    private Scanner respuesta;

    public Vista() {
        this.respuesta = new Scanner(System.in);
    }


    public int solicitarNumero() {
        System.out.println("Por favor ingresa un numero: ");
        return respuesta.nextInt();
    }

    public String solicitarRespuesta() {
        System.out.println("¿Quieres ingresar otro numero? (si/no): ");
        return respuesta.next();
    }

    public void mostrarResultado(int numero, String resultado) {
        System.out.println("El resultado para el numero " + numero + " es: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarResultadosAcumulados() {
        System.out.println("Mostrando los resultados acumulados...");
    }
}
