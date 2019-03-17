package tdd;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class HeavyService {
    @PostConstruct
    public void init(){
        System.out.println("waiting for the winter");
    }
}
