package vista;

import java.util.Scanner;

public class VistaSeguridad {
    private Scanner scanner;

    public VistaSeguridad() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- Sistema de Seguridad ---");
        System.out.println("1. Activar modo noche");
        System.out.println("2. Desactivar modo noche");
        System.out.println("3. Simular detección");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
