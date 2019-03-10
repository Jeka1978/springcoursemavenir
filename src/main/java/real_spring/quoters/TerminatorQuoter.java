package real_spring.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TerminatorQuoter implements Quoter {
    @Setter
    private List<String> messages;



    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    public void killAll() {
        System.out.println("You are terminated...");
    }





}
