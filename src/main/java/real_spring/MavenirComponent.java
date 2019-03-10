package real_spring;/**
 * @author Evgeny Borisov
 */

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Component
public @interface MavenirComponent {
}
