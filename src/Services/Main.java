package Services;

import Model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import MinhasExceptions.MinhasExceptions.ValidaNumeroException;
import static Model.variaveisConstantes.*;


public class Main {
    public static void main(String[] args) throws IOException,ValidaNumeroException{

        NumerosRandomizados n = new NumerosRandomizados(TAMANHO.getValor(), PRIMEIRO.getValor(), ULTIMO.getValor());


        // List<Integer> organizada = List.of(new BubbleSort().agrupa(n.getArrayNumeros()));

        //GerenciaArquivo.salvaArquivo(organizada,TAMANHO.getValor());
        List<Integer> organizada = GerenciaArquivo.leArquivo(TAMANHO.getValor());

            Integer elemento = NumeroAPesquisar.numeroDaBusca(PRIMEIRO.getValor(), ULTIMO.getValor());
            System.out.println("procurando elemento: "+ elemento);


        List<TempoBusca> listaTemp = List.of(new TempoLinear(), new TempoOrdenado(), new TempoBinaria());
        ImprimeTempo imprimeTempo = new ImprimeTempo(listaTemp);
        imprimeTempo.fazerBuscas(organizada, elemento);

    }

}
