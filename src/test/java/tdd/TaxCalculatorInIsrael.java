package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MainConf.class)
@ActiveProfiles("ISRAEL")
public class TaxCalculatorInIsrael {
    @Autowired
    private TaxCalculatorImpl taxCalculator;


    @Test
    public void testIsraelTaxCalc() {
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(117,withMaam,0.000001);
    }
}
