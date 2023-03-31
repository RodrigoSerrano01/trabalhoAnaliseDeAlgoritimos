package Model.Enum;




/**
 * @author Rodrigo Serrano Silveira
 *
 *
 *  Variaveis usadas para os tamanhos e na geração de numeros randomicos.
 *
 *
 */

public enum variaveisConstantes {

    TAMANHO(1000000), PRIMEIRO(1), ULTIMO(2000000);


    private final int valor;


    variaveisConstantes(int valor) {
        this.valor = valor;
    }

    public Integer getValor(){
        return valor;
    }
}
