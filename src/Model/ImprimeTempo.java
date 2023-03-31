package Model;

import java.util.List;

public class ImprimeTempo {

    private List<TempoBusca> tempos;

    public ImprimeTempo(List<TempoBusca> tempos) {
        this.tempos = tempos;
    }

    public void fazerBuscas(List<Integer> lista, Integer elemento){
        this.tempos.forEach(a->a.tempoBusca(lista,elemento));
    }
}
