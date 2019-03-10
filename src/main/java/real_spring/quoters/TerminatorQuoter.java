package real_spring.quoters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Film
public class TerminatorQuoter implements Quoter {
    private List<String> messages;


    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = Arrays.asList(messages);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll() {
        System.out.println("You are terminated...");
    }


}
