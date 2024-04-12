package Analisis_Genomico;

public class ConteoGenes {
    private final String secuenciaADN;

    public ConteoGenes(String secuenciaADN) {
        this.secuenciaADN = secuenciaADN;
    }

    public int contarGenes() {
        return contarGenesRecursivo(secuenciaADN);
    }

    private int contarGenesRecursivo(String subsecuenciaADN) {
        int count = 0;
        for (int startCodonIndex = subsecuenciaADN.indexOf("ATG"); startCodonIndex != -1; startCodonIndex = subsecuenciaADN.indexOf("ATG")) {
            count++;
            subsecuenciaADN = subsecuenciaADN.substring(startCodonIndex + 3); // Skip the start codon
        }
        return count;
    }
}
