package real_spring.quoters;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    @Setter
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
