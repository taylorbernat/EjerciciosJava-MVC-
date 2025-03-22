
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo2 {
    private List<String> resultados;

    public Modelo2() {
        this.resultados = new ArrayList<>();
    }

    public void agregarResultado(String resultado) {
        resultados.add(resultado);
    }

    public void mostrarResultados() {
        System.out.println("Resultados almacenados:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
