import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    private PrimeFactor primeFactor;

    @BeforeEach
    public void setUp() throws Exception {
        primeFactor = new PrimeFactor();
    }

    @Test
    public void testPrimeFactorOf1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    public void testPrimeFactorOf2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    public void testPrimeFactorOf3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    public void testPrimeFactorOf4() {
        assertEquals(Arrays.asList(2, 2), primeFactor.of(4));
    }
}
