package Herramientas_Analisis_Numerico;

public class CalculoPotenciasMaximos {
    public long calcularPotencia(int base, int exponente) {
        // Convert to long to handle potential overflow issues
        long result = 1;
        for (int i = 0; i < exponente; i++) {
            result *= base;
        }
        return result;
    }
}
