package Model;

import java.util.Random;

public abstract class NumeroAPesquisar {


    public static Integer numeroDaBusca(Integer tamanho){

        return new Random().nextInt(tamanho);
    }
}
