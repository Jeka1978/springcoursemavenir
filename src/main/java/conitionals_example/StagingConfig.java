package conitionals_example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Configuration
@Staging
@PropertySource("classpath:staging.properties")
public class StagingConfig {
    @PostConstruct
    public void init(){
        System.out.println("staging env....");
    }
}
