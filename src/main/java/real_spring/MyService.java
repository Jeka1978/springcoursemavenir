package real_spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@MavenirComponent
public class MyService {
    @PostConstruct
    public void init() {
        System.out.println(22222);
    }
}
