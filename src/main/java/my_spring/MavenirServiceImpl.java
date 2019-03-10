package my_spring;

/**
 * @author Evgeny Borisov
 */


public class MavenirServiceImpl implements MavenirService {
    @Override
    @Benchmark
    public void doWork() {
        System.out.println("Working...");
    }

    @Override
    public void drinkBeer() {
        System.out.println("drinking beer");
    }
}
