package my_spring;

/**
 * @author Evgeny Borisov
 */

@Benchmark
public final class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 3,max = 5)
    private int repeat;
    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVvvvvvvvvvvvvvvv");
        }
    }
}
