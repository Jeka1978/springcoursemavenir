package my_spring;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class ConsoleSpeaker implements Speaker {
    @Override
    public void say(String message) {
        System.out.println(message);
    }
}
