package Model;

public enum variaveisConstantes {

    TAMANHO(100000), PRIMEIRO(1), ULTIMO(200000);


    private final int valor;


    variaveisConstantes(int valor) {
        this.valor = valor;
    }

    public Integer getValor(){
        return valor;
    }
}
