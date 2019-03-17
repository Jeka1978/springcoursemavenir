package tdd;

import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class MainConf {

    @Bean
    public Integer x(){
        return 1;
    }
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MainConf.class);
    }
}
