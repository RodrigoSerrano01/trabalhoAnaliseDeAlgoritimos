package Model;

import java.util.List;

public  class TempoLinear implements TempoBusca {

    private double tempo;
    @Override
    public double tempoBusca(List<Integer> lista, Integer elemento) {
        double start =  System.nanoTime();
        Integer aux = BuscaLinear.buscaElemento(lista,elemento);
        double end =  System.nanoTime();
        this.tempo = ((end - start)/ 1000000);
        return tempo;
    }


    @Override
    public String toString(){
        return String.format("Tempo de execução busca Linear: %.6f ms", this.tempo);

    }
}
