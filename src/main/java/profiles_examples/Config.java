package profiles_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Config {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
