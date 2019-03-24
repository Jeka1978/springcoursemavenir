package aop_problems;

import lombok_examples.Main;
import more_qualifiers.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Autowired
    private SaveService saveService;

    @Autowired
    private MainService myProxy;

    public void start(){
        System.out.println(1);
        System.out.println(2);
        this.saveData();
    }

    @Transactional
    public void saveData() {
        saveService.save();
    }
}






