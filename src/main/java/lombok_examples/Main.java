package lombok_examples;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Evgeny Borisov
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .salary(18).oneFish("Tuborg",1)
                .name("Lilya").build();
       log.info("employee = " + employee);


    }
}
