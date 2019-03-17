package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculatorImplTest {

    @Test
    public void withMaam() {
        MaamResolver mock = Mockito.mock(MaamResolver.class);
        Mockito.when(mock.getMaam()).thenReturn(0.1);

        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl(mock);
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(110,withMaam,0.00001);

    }
}
