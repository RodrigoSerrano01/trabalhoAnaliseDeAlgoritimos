package Model;

import java.util.Random;

public abstract class NumeroAPesquisar {


    public static Integer numeroDaBusca(Integer primeiro, Integer ultimo){

        return new Random().nextInt(ultimo);
    }
}
