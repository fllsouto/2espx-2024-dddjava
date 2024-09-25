package br.com.fiap.twoespx.libuncleotidio.model;

public class NucletidioSequence {
    private String sequence;
    private Integer freqA; 
    private Integer freqC; 
    private Integer freqT; 
    private Integer freqG;


    public NucletidioSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }
    public Integer getFreqA() {
        return freqA;
    }
    public Integer getFreqC() {
        return freqC;
    }
    public Integer getFreqT() {
        return freqT;
    }
    public Integer getFreqG() {
        return freqG;
    }

        

}
