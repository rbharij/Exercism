import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreditCardTest {

    @Test
    public void CCTest() {
        //SpaceAge age = new SpaceAge(1000000);
        String input = "4556737586899855";
        assertEquals("Valid Credit Card", CreditCard.check(input));
    }

    @Test
    public void invalidCCTest(){
        String input = "4578423013769210";
        assertEquals("Invalid Credit Card", CreditCard.check(input));
    }


}