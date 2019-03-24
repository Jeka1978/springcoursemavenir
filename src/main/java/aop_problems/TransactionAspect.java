package aop_problems;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class TransactionAspect {

    @SneakyThrows
    @Around("@annotation(Transactional)")
    public void doWithTransaction(ProceedingJoinPoint pjp){
        System.out.println("TRANSACTION OPENED");
        pjp.proceed();
        System.out.println("TRANSACTION CLOSED");
    }
}













