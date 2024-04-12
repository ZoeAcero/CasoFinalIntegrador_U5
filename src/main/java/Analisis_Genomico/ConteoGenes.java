package Analisis_Genomico;

public class ConteoGenes {
    private final String secuenciaADN;

    public ConteoGenes(String secuenciaADN) {
        this.secuenciaADN = secuenciaADN;
    }

    public int contarGenes() {
        return contarGenesRecursivo(secuenciaADN);
    }

    
}
