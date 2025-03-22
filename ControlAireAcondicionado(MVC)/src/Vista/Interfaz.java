package Vista;
import java.util.Scanner;

public class Interfaz {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void esperarEnter() {
        System.out.println("Presiona Enter para continuar...");
        scanner.nextLine();
    }
}
