package my_spring;



/**
 * @author Evgeny Borisov
 */
public class IRobot {

    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.say("I started");
        cleaner.clean();
        speaker.say("I finished");



    }
}




