package exceptionEx;

public class MediaException extends Exception{
    public MediaException() {
        super( "numbers não pode ser nulo e deve conter pelo menos 2 valores");
    }
}
