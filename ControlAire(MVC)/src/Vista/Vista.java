package Vista;

import java.util.Scanner;

public class Vista {
    private Scanner respuestas;

    public Vista() {
        respuestas = new Scanner(System.in);
    }

    public void mostrarMensajeBienvenida() {
        System.out.println("Bienvenido al sistema de control de aire acondicionado.");
    }

    public double pedirTemperatura() {
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        return respuestas.nextDouble();
    }

    public double pedirHumedad() {
        System.out.print("Ingrese la humedad en porcentaje: ");
        return respuestas.nextDouble();
    }

    public boolean deseaContinuar() {
        System.out.print("¿Desea ingresar otra temperatura y humedad? (si/no): ");
        String respuesta = respuestas.next();
        return respuesta.equalsIgnoreCase("si");
    }

    public void mostrarMensajeFin() {
        System.out.println("Programa finalizado.");
    }
}
