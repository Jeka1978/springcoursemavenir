package real_spring.quoters;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
