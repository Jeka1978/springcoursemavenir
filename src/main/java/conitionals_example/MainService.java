package conitionals_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Value("${name}")
    private String name;

    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        System.out.println(name + " salary was increased");
    }
}
