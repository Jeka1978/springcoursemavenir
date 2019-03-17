package aop_more;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class SecurityAspect {

    @Around("@annotation(Secured)")
    @SneakyThrows
    public Object doSecured(ProceedingJoinPoint pjp) {
        if (false) {
            return pjp.proceed();
        }
        throw new SecurityException("not allowed here");

    }
}
