package aop_more;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class ExceptionHandlerAspect {
    @Value("${dba.mails}")
    private String[] mails;

    private Map<DBException,Void> exceptions = new WeakHashMap();

    @Pointcut("execution(* aop_more..*.*(..))")
    public void allBusinessMethods(){}

    @AfterThrowing(pointcut = "allBusinessMethods()&&@annotation(Deprecated)", throwing = "ex")
    public void handleDBExceptions(DBException ex) {
        if (!exceptions.containsKey(ex)) {
            for (String mail : mails) {
                System.out.println(ex.getMessage()+" sent to "+mail);
            }
            exceptions.put(ex,null);

        }
    }


}
