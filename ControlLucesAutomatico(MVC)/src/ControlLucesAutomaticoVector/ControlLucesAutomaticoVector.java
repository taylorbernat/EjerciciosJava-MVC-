package ControlLucesAutomaticoVector;

import Controlador.Controlador;
import java.util.Scanner;

public class ControlLucesAutomaticoVector {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Controlador controlador = new Controlador(3); 
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENU DOMOTICO ---");
            System.out.println("1. Cambiar Dia/Noche");
            System.out.println("2. Activar/Desactivar Movimiento");
            System.out.println("3. Ver estado de las luces");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Es de noche? (true/false): ");
                    boolean noche = sc.nextBoolean();
                    controlador.setEsDeNoche(noche);
                    break;
                case 2:
                    System.out.print("Ingrese número de habitación (0-2): ");
                    int habitacion = sc.nextInt();
                    System.out.print("Hay movimiento? (true/false): ");
                    boolean movimiento = sc.nextBoolean();
                    controlador.detectarMovimiento(habitacion, movimiento);
                    break;
                case 3:
                    controlador.actualizarLuces();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

            Thread.sleep(10000);
        }
        sc.close();
    }
}
