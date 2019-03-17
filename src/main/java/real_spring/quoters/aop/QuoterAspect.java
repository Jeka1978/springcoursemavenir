package real_spring.quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* real_spring.quoters..*.say*(..))")
    public void handleSayMethods(JoinPoint jp) {
        System.out.print("This is quote "+ jp.getTarget().getClass().getSimpleName()+": ");
    }

}
