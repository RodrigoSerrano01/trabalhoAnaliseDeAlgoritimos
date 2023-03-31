package MinhasExceptions;

public class MinhasExceptions {
    public static class ValidaNumeroException extends RuntimeException{


        private static final long serialVersionUID = 1L;

        public ValidaNumeroException(String mensagem) {
            super(mensagem);
        }

    }
}
