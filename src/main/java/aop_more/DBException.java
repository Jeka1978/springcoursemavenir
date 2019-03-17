package aop_more;

/**
 * @author Evgeny Borisov
 */
public class DBException extends RuntimeException {
    public DBException() {
    }

    public DBException(String message) {
        super(message);
    }
}
