package profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@TestProfile
//spring.profiles.active = PROD
public class TestDao implements Dao {
    @Override
    public void load() {
        System.out.println("saving to test");
    }
}
