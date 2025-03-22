package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo2 {
    private List<String> resultados; 

    public Modelo2() {
        this.resultados = new ArrayList<>();
    }
    
    public void agregarResultado(int temperatura, String estado) {
        resultados.add("Temperatura: " + temperatura + "°C, Estado: " + estado);
    }

    public void mostrarResultados() {
        System.out.println("Resultados almacenados:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }

    public List<String> obtenerResultados() {
        return resultados;
    }
}
