package tdd;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class TaxCalculatorImpl implements TaxCalculator {
    private final MaamResolver maamResolver;

    @PostConstruct
    public void init() {
        System.out.println(maamResolver.getMaam());
    }

    private int x;

    @Override
    public double withMaam(double price) {

        return maamResolver.getMaam() * price+price;
    }


    public TaxCalculatorImpl(MaamResolver maamResolver, int x) {
        this.maamResolver = maamResolver;
        this.x = x;
    }
}






