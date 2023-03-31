package Model.Enum;

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
