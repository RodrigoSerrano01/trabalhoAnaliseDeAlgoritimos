package Services.BuscaService;
import MinhasExceptions.MinhasExceptions.ValidaNumeroException;
import java.util.List;

public abstract class BuscaOrdenada {

    public static int buscaElemento(List<Integer> lista, Integer elemento) throws ValidaNumeroException{
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).intValue() > elemento) {
                System.out.println("numero não encontrado ordenada");
                return -1;
            }
            if (lista.get(i).equals(elemento)) {
                return lista.get(i).intValue();
            }
        }

       // throw new ValidaNumeroException("Numero não encontrado");
        System.out.println("numero não encontrado ordenada");
        return -1;
    }

}