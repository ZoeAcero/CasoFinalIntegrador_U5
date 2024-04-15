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

    public long encontrarMaximo(int base, int exponente) {
        // Calculate the power of the base and exponent
        long powerResult = calcularPotencia(base, exponente);
        // Return the maximum of the base, exponent, and power result
        return Math.max(base, Math.max(exponente, powerResult));
    }
}

