package my_spring;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    public void say(String message) {
        System.out.println(message);
    }
}
