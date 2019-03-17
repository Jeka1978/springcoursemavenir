package tdd;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile("RUSS")
public class RussianMaamResolver implements MaamResolver {
    @Override
    public double getMaam() {
        return 0.2;
    }

    public RussianMaamResolver() {
        System.out.println("Russian maam resolver was created");
    }
}
