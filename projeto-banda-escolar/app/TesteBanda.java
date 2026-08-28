package app;

import model.InstrumentoMusical;
import model.Violao;
import model.Bateria;
import java.util.ArrayList;
import java.util.List;

public class TesteBanda {
    public static void main(String[] args) {
        Violao violao = new Violao(6);
        Bateria bateria = new Bateria(5);
        
        List<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(bateria);
        
        System.out.println("=== ENSAIO DA BANDA ===\n");
        
        for (InstrumentoMusical instrumento : instrumentos) {
            System.out.println("Afinando " + instrumento.getNome() + "...");
            instrumento.afinar();
            
            System.out.println("Tocando " + instrumento.getNome() + "...");
            System.out.println("Som: " + instrumento.tocar());
            System.out.println();
        }
        
        int contadorAfinados = 0;
        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento.isAfinado()) {
                contadorAfinados++;
            }
        }
        
        System.out.println("=== RESUMO ===");
        System.out.println("Instrumentos afinados: " + contadorAfinados + " de " + instrumentos.size());
        
        /*
         * new InstrumentoMusical(...) não compila porque InstrumentoMusical é abstrata.
         * Classes abstratas não podem ser instanciadas diretamente.
         * Isso garante que só possamos criar objetos de tipos concretos.
         */
    }
}