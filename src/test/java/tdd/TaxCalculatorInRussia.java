package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MockConfiguration.class)
@ActiveProfiles("RUSS")
public class TaxCalculatorInRussia {
    @Autowired
    private TaxCalculatorImpl taxCalculator;


    @Test
    public void testIsraelTaxCalc() {
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(120,withMaam,0.000001);
    }
}
