package real_spring.quoters;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class StamService {

    @EventListener(ContextRefreshedEvent.class)
    @PostConstruct
    public void sayBlaBla(){
        System.out.println("Bla bla");
    }
}
