package my_spring;

import lombok.ToString;

import javax.annotation.PostConstruct;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Elf {
    @InjectRandomInt(min = 100, max = 150)
    private int power;
    @InjectRandomInt(min = 20, max = 30)
    private int speed;

    @PostConstruct
    public void init() {
        System.out.println(speed);
    }
}
