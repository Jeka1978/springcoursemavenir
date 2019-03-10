package more_qualifiers;

import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import static more_qualifiers.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@MavenirRepository(ORACLE)
public class OracleDao implements Dao {
    @Override
    @SneakyThrows
    public void save() {
        Thread.sleep(500);
        System.out.println("saving to ORACLE...");
    }
}
