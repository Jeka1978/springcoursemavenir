package my_spring;

/**
 * @author Evgeny Borisov
 */

@Benchmark
public class MavenirServiceImpl implements MavenirService {
    @Override
    public void doWork() {
        System.out.println("Working...");
    }

    @Override
    public void drinkBeer() {
        System.out.println("drinking beer");
    }
}
