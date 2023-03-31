package MainApllication;

import java.io.IOException;
import java.util.List;
import MinhasExceptions.MinhasExceptions.ValidaNumeroException;
import Model.TempoModel.TempoBusca;
import Services.ArquivosService.GerenciaArquivo;
import Services.ImpressaoService.ImprimeTempo;
import Services.NumerosService.BubbleSort;
import Services.NumerosService.NumeroAPesquisar;
import Services.NumerosService.NumerosRandomizados;
import Services.TempoService.TempoBinaria;
import Services.TempoService.TempoLinear;
import Services.TempoService.TempoOrdenado;

import static Model.Enum.variaveisConstantes.*;

/**
 *
 * @author Rodrigo Serrano Silveira, Lucas Tatsch Corrêa
 *
 * Classe responsavel de por rodar o programa
 *
 * chama as funções para criar o arquivo com os numeros e também lê os arquivos.
 *
 * Cria uma lista das classes tempo e executa todos os calculos dos métodos.
 *
 *
 */


public class Main {
    public static void main(String[] args) throws IOException,ValidaNumeroException{

        NumerosRandomizados n = new NumerosRandomizados(TAMANHO.getValor(), PRIMEIRO.getValor(), ULTIMO.getValor());


        //SE QUISER SÓ RODAR, DEIXE SOMENTE A LEARQUIVOS (48);
        //SE QUISER CRIAR ARQUIVOS COMENTE A LEARQUIVOS(48) E DESCOMENTE AS LINHA (42/43)

        /*
         List<Integer> organizada = List.of(new BubbleSort().agrupa(n.getArrayNumeros()));
        GerenciaArquivo.salvaArquivo(organizada,TAMANHO.getValor());

         */

        //COMENTE ESSA
        List<Integer> organizada = GerenciaArquivo.leArquivo(TAMANHO.getValor());

            Integer elemento = NumeroAPesquisar.numeroDaBusca(PRIMEIRO.getValor(), ULTIMO.getValor());
            System.out.println("procurando elemento: "+ elemento);


        List<TempoBusca> listaTemp = List.of(new TempoLinear(), new TempoOrdenado(), new TempoBinaria());
        ImprimeTempo imprimeTempo = new ImprimeTempo(listaTemp);
        imprimeTempo.fazerBuscas(organizada, elemento);

    }

}
