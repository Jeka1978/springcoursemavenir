package real_spring.quoters;

import lombok.Setter;
import my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
@Book
public class ShakespearQuoter implements Quoter {
    @Setter
    @Value("${shake}")
    private String message;

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}



