package Ex3;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException() {
    }

    public ValorInvalidoException(String message) {
        super(message);
    }

    public ValorInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValorInvalidoException(Throwable cause) {
        super(cause);
    }

    public ValorInvalidoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
