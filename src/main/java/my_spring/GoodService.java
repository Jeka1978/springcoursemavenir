package my_spring;

/**
 * @author Evgeny Borisov
 */
public class GoodService  {
    @Benchmark
    public void killBadPeople() {
        System.out.println("Joffri Was killed");
    }
}
