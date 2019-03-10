package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        GoodService goodService = ObjectFactory.getInstance().createObject(GoodService.class);
        System.out.println(goodService.getClass().getName());
        MavenirService mavenirService = ObjectFactory.getInstance().createObject(MavenirService.class);
        System.out.println("mavenirService = " + mavenirService.getClass().getName());
        goodService.killBadPeople();

//        IRobot robot = ObjectFactory.getInstance().createObject(IRobot.class);
//        robot.cleanRoom();
//        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
//        System.out.println("elf = " + elf);
    }
}
