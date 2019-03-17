package aop_more;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Helper {
    @Autowired
    private Repo dao;

    @Secured
    public void help(){
        System.out.println(dao.getText());
        System.out.println("I'm your best friend");
    }
}
