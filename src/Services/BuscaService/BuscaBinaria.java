package Services.BuscaService;

import MinhasExceptions.MinhasExceptions;

import java.util.List;
import MinhasExceptions.MinhasExceptions.ValidaNumeroException;

public class BuscaBinaria  {



    /**
     * @author  Lucas Tatsch Corrêa
     *
     *
     *  Aloritimo de busca binaria.
     *
     *
     */

    public static int buscaElemento(List<Integer> lista, Integer elemento)  throws ValidaNumeroException {
        int start = 0;
        int end = lista.size();
        int mid;

        while (start <= end) {
            mid = ((start + end) / 2);

            if (lista.get(mid).intValue() < elemento) {
                start = mid + 1;
            } else if (lista.get(mid).intValue() > elemento) {
                end = mid - 1;
            } else {
                return lista.get(mid).intValue();

            }
        }
          // throw new ValidaNumeroException("Numero não encontrado");
        System.out.println("numero não encontrado binaria");
        return -1;

    }

}
