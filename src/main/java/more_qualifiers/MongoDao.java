package more_qualifiers;

import org.springframework.stereotype.Repository;

import static more_qualifiers.DBType.MONGO;

/**
 * @author Evgeny Borisov
 */
@MavenirRepository(MONGO)
public class MongoDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving to mongo...");
    }
}
