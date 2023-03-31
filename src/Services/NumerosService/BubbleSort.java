package Services.NumerosService;


import Model.NumerosModel.Sort;

import java.util.stream.IntStream;


/**
 * @author Rodrigo Serrano Silveira, Lucas Tatsch Corrêa
 *
 *  Ordena a lista de numeros.
 *
 *
 *
 */
public class BubbleSort implements Sort {


    @Override
    public Integer[] agrupa(Integer[] lista) {
        int n = lista.length;

        IntStream.range(0,n-1)
                .flatMap(i->IntStream.range(1,n -i))
                .forEach(j->{
                    if(lista[j-1]>lista[j]){
                    int temp = lista[j];
                        lista[j] = lista[j-1];
                        lista[j-1] = temp;
                    }
                });
        return lista;
    }
}
