package tdd;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile("ISRAEL")
public class IsraelMaamResolver implements MaamResolver {
    @Override
    public double getMaam() {
        return 0.17;
    }
}
