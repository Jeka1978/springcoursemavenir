package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        IRobot robot = ObjectFactory.getInstance().createObject(IRobot.class);
//        robot.cleanRoom();
        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println("elf = " + elf);
    }
}
