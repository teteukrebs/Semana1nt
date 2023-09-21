package exceptionEx;

public class DivisaoException extends Exception {
    public DivisaoException() {
        super("numbers não pode ser nulo e deve conter pelo menos 2 valores e nenhum dos valores pode ser < 1");
    }
}
