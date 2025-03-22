package Vista;

public class Vista {
    public void mostrarEstadoLuces(boolean lucesEncendidas) {
        if (lucesEncendidas) {
            System.out.println("Las luces están ENCENDIDAS.");
        } else {
            System.out.println("Las luces están APAGADAS.");
        }
    }

    public void mensaje(String msg) {
        System.out.println(msg);
    }
}
