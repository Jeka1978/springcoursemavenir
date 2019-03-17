package profiles_examples;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Profile;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Profile("PROD")
public @interface ProdProfile {
}
