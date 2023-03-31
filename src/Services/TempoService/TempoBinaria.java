package Services.TempoService;

import java.util.List;
import MinhasExceptions.MinhasExceptions.ValidaNumeroException;
import Services.BuscaService.BuscaBinaria;
import Model.TempoModel.TempoBusca;

public class TempoBinaria implements TempoBusca {
    public double tempo;

    @Override
    public double tempoBusca(List<Integer> lista, Integer elemento) throws ValidaNumeroException{
        double start = System.nanoTime();
        Integer aux = BuscaBinaria.buscaElemento(lista, elemento);
        double end = System.nanoTime();
        this.tempo = ((end - start) / 1000000);
        System.out.println(toString());
        return tempo;
    }

    @Override
    public String toString() {
        return String.format("Tempo de execução busca Binaria: %.6f ms", this.tempo);
    }

}
