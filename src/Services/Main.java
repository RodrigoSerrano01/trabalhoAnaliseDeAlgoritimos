package Services;

import Model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Model.variaveisConstantes.*;


public class Main {
    public static void main(String[] args) throws IOException {

        NumerosRandomizados n = new NumerosRandomizados(TAMANHO.getValor(), PRIMEIRO.getValor(), ULTIMO.getValor());


        // List<Integer> organizada = List.of(new BubbleSort().agrupa(n.getArrayNumeros()));

        //GerenciaArquivo.salvaArquivo(organizada,TAMANHO.getValor());
        List<Integer> organizada = GerenciaArquivo.leArquivo(TAMANHO.getValor());

        Integer index = NumeroAPesquisar.numeroDaBusca(TAMANHO.getValor());
        Integer elemento = organizada.get(index).intValue();

        System.out.println("Index: " + index + " Numero de elemento:" + elemento);
        BuscaBinaria.buscaElemento(organizada,elemento);
        TempoLinear tempoLinear = new TempoLinear();
        TempoOrdenado tempoOrdenado = new TempoOrdenado();
        TempoBinaria tempoBinaria = new TempoBinaria();

      //  tempoLinear.tempoBusca(organizada, elemento);
      //  tempoOrdenado.tempoBusca(organizada, elemento);
      //  tempoBinaria.tempoBusca(organizada, elemento);



       // List<TempoBusca> listaTempo;
       // listaTempo.forEach(a -> a.tempoBusca(organizada,elemento));
        List<TempoBusca> listaTemp= new ArrayList<TempoBusca>();
       ImprimeTempo imprimeTempo = new ImprimeTempo(listaTemp);
       imprimeTempo.fazerBuscas(organizada,elemento);

    }


}
