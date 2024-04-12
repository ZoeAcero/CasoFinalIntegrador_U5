package Herramientas_Analisis_Numerico;

import java.util.ArrayList;
import java.util.List;

public class SumatoriaListadoNumeros {
    public List<Integer> listarNumerosEnRango(int inicio, int fin) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    public int calcularSumatoria(List<Integer> numeros) {
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        return sumatoria;
    }
}