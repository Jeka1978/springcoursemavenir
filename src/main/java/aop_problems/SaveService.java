package aop_problems;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class SaveService {
    @Transactional
    public void save() {
        System.out.println("one peace was saved");
    }
}
