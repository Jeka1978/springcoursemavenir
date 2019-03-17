package aop_more;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MainService {
    private final Helper helper;


    @Scheduled(fixedDelay = 5000)
    public void doWork(){
        System.out.println("Working");
        try {
            helper.help();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Still alive");
    }
}





