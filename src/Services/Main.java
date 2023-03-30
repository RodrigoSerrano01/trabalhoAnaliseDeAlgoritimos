package Services;

import Model.*;

import java.io.IOException;
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

        TempoLinear tempoLinear = new TempoLinear();
        TempoOrdenado tempoOrdenado = new TempoOrdenado();

        tempoLinear.tempoBusca(organizada, elemento);
        tempoOrdenado.tempoBusca(organizada, elemento);

        System.out.println(tempoLinear);
        System.out.println(tempoOrdenado);

    }


}
