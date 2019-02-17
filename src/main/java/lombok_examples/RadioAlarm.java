package lombok_examples;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@ToString(exclude = "radio")
@EqualsAndHashCode(exclude = "alarm")
@Setter
public class RadioAlarm implements Radio, Alarm {
    @Delegate(excludes = RadioExclusions.class)
    private Radio radio;
    @Delegate
    private Alarm alarm;

    public void b() {

    }
}
