package Services.TempoService;

import Services.BuscaService.BuscaLinear;
import Model.TempoModel.TempoBusca;

import java.util.List;


/**
 * @author Rodrigo Serrano Silveira, Lucas Tatsch Corrêa
 *
 * classe que calcula o tempo que o metodo buscaElemento demora para executar
 *
 * calcula e printa o resultado.
 *
 *
 *
 */
public  class TempoLinear implements TempoBusca {

    private double tempo;
    @Override
    public double tempoBusca(List<Integer> lista, Integer elemento) {
        double start =  System.nanoTime();
        Integer aux = BuscaLinear.buscaElemento(lista,elemento);
        double end =  System.nanoTime();
        this.tempo = ((end - start)/ 1000000);
        System.out.println(toString());
        return tempo;
    }


    @Override
    public String toString(){
        return String.format("Tempo de execução busca Linear: %.6f ms", this.tempo);

    }
}
