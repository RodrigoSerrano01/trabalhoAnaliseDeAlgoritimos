package Model;

public enum variaveisConstantes {

    TAMANHO(3), PRIMEIRO(1), ULTIMO(2000);


    private final int valor;


    variaveisConstantes(int valor) {
        this.valor = valor;
    }

    public Integer getValor(){
        return valor;
    }
}
