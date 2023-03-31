package Services.ImpressaoService;

import Model.TempoModel.TempoBusca;

import java.util.List;

public class ImprimeTempo {


    /**
     * @author Rodrigo Serrano Silveira
     *
     * Classe usada para poder usar polimorfismo nas buscas de tempo.
     *
     *
     *
     */
    private List<TempoBusca> tempos;

    public ImprimeTempo(List<TempoBusca> tempos) {
        this.tempos = tempos;
    }

    public void fazerBuscas(List<Integer> lista, Integer elemento){
        this.tempos.forEach(a->a.tempoBusca(lista,elemento));
    }
}
