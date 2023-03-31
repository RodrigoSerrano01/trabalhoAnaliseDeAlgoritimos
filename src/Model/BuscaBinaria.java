package Model;

import java.util.List;

public class BuscaBinaria {



    public static int buscaElemento(List<Integer> lista, Integer elemento) {
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

        return -1; // Elemento não existe na lista
    }

}
