package Model;
import MinhasExceptions.MinhasExceptions.ValidaNumeroException;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BuscaLinear {

    public static Integer buscaElemento(List<Integer> lista, Integer elemento) throws ValidaNumeroException{



        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).equals(elemento)) {
                return lista.get(i).intValue();
            }
        }
        throw new ValidaNumeroException("Numero não encontrado");

    }
}