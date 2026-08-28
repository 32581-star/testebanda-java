package model;

public class Violao extends InstrumentoMusical {
    private int quantidadeCordas;
    
    public Violao(int quantidadeCordas) {
        super("Violão", "madeira");
        this.quantidadeCordas = quantidadeCordas;
    }
    
    @Override
    public String tocar() {
        return "Som de cordas dedilhadas";
    }
    
    public int getQuantidadeCordas() {
        return quantidadeCordas;
    }
}