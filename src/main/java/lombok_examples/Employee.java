package lombok_examples;

import lombok.*;
import lombok.experimental.Wither;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@Value
@Builder
@Wither
public class Employee {
    private String name;
    private int age;
    @NonNull
    private Integer salary;
    @Singular("oneFish")
    private Map<String,Integer> fish;






}
