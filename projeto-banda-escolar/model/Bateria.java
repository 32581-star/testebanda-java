package model;

public class Bateria extends InstrumentoMusical {
    private int quantidadeTambores;
    
    public Bateria(int quantidadeTambores) {
        super("Bateria", "metal");
        this.quantidadeTambores = quantidadeTambores;
    }
    
    @Override
    public String tocar() {
        return "Som grave de batidas";
    }
    
    public int getQuantidadeTambores() {
        return quantidadeTambores;
    }
}