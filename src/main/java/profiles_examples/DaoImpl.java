package profiles_examples;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@ProdProfile
//spring.profiles.active = PROD
public class DaoImpl implements Dao {
    @Override
    public void load() {
        System.out.println("saving to prod");
    }
}
