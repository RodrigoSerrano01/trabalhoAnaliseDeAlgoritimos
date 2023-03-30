package Model;

import java.util.List;

public class TempoOrdenado implements TempoBusca{
    public double tempo;

    //@Override
    public double tempoBusca(List<Integer> lista, Integer elemento) {
        double start = System.nanoTime();
        System.out.println(start);
        Integer aux = BuscaOrdenada.buscaElemento(lista,elemento);
        double end =  System.nanoTime();
        this.tempo = ((end - start)/ 1000000);
        System.out.println(start+ " - "+ end+" = "+this.tempo);
       // System.out.println(String.format("Tempo de execução busca Ordenada: %.10f ms", this.tempo));

        return tempo;
    }

    @Override
    public String toString(){
        return String.format("Tempo de execução busca Ordenada: %.6f ms", this.tempo);
    }

}
