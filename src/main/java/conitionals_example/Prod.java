package conitionals_example;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(OnProdCondition.class)
public @interface Prod {
}
