package Vista;
import java.util.Scanner;

public class Interfaz {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public boolean solicitarBooleano(String pregunta) {
        System.out.print(pregunta + " (true/false): ");
        return scanner.nextBoolean();
    }
}
