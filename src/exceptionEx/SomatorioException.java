package exceptionEx;

public class SomatorioException extends Exception{
    public SomatorioException() {
        super("start não pode ser menor ou igual a end e start e end não podem ser nulos");
    }
}
