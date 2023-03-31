package MinhasExceptions;

public class MinhasExceptions {


    /**
     * @author Rodrigo Serrano Silveira
     *
     * Tratamento de excessão
     *
     *
     *
     */
    public static class ValidaNumeroException extends RuntimeException{


        private static final long serialVersionUID = 1L;

        public ValidaNumeroException(String mensagem) {
            super(mensagem);
        }

    }
}
