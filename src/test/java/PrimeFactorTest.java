import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    @Test
    public void testPrimeFactorOf1() {
        PrimeFactor primeFactor = new PrimeFactor();

        assertEquals(Arrays.asList(), primeFactor.of(1));
    }
}
