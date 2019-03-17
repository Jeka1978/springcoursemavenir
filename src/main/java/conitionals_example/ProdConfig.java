package conitionals_example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Prod
@Configuration
@PropertySource("classpath:prod.properties")
public class ProdConfig {
    @PostConstruct
    public void init(){
        System.out.println("prod env");
    }
}
