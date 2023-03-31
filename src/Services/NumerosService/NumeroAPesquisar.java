package Services.NumerosService;

import java.util.Random;



/**
 * @author Rodrigo Serrano Silveira
 *
 * Gera o numero que será  usado para pesquisar nas buscas.
 *
 *
 *
 */
public abstract class NumeroAPesquisar {


    public static Integer numeroDaBusca(Integer primeiro, Integer ultimo){

        return new Random().nextInt(ultimo);
    }
}
