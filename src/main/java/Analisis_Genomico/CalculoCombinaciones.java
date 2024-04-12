package Analisis_Genomico;

public class CalculoCombinaciones {
    private String modeloGenetico;

    public CalculoCombinaciones(String modeloGenetico) {
        this.modeloGenetico = modeloGenetico;
    }

    public int calcular() {
        return modeloGenetico.length();
    }
}
