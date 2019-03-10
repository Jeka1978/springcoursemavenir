package more_qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static more_qualifiers.DBType.MONGO;
import static more_qualifiers.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service
public class SomeService {
    @MavenirRepository(MONGO)
    private Dao prodDao;

    @MavenirRepository(ORACLE)
    private Dao backupDao;

    @Scheduled(fixedDelay = 500)
    public void doWork() {
        prodDao.save();
    }

    @Scheduled(fixedDelay = 1500)
    public void doBackup() {
        backupDao.save();
    }
}
