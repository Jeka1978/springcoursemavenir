package real_spring.quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@ComponentScan(basePackages = "my_spring")
@PropertySource("classpath:qoutes.properties")
public class QuoterMainConf {
}
