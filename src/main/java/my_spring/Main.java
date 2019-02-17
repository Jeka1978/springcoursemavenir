package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        MavenirService mavenirService = ObjectFactory.getInstance().createObject(MavenirService.class);
        mavenirService.doWork();
        mavenirService.drinkBeer();
//        IRobot robot = ObjectFactory.getInstance().createObject(IRobot.class);
//        robot.cleanRoom();
//        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
//        System.out.println("elf = " + elf);
    }
}
