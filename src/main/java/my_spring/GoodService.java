package my_spring;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */

@EnableScheduling
public class GoodService  {
    @Benchmark
    @Scheduled(fixedDelay = 1000)
    public void killBadPeople() {
        System.out.println("Joffri Was killed");
    }
}
