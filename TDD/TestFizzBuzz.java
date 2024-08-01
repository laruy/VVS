import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    
    static FizzBuzz fb = new FizzBuzz();
    static int testData;

    @BeforeAll
    static void setUp()
    {
        fb = new FizzBuzz();
    }

    @Test
    void testFb01()
    {
        assertEquals("Fizz", fb.getFizzBuzString(3));
        assertEquals("Fizz", fb.getFizzBuzString(9));
        assertEquals("Fizz", fb.getFizzBuzString(27));
    }

    @Test
    void testFb02()
    {
        assertEquals("Buzz", fb.getFizzBuzString(5));
        assertEquals("Buzz", fb.getFizzBuzString(10));
        assertEquals("Buzz", fb.getFizzBuzString(95));
    }

    @Test
    void testFb03()
    {
        assertEquals("FizzBuzz", fb.getFizzBuzString(30));
        assertEquals("FizzBuzz", fb.getFizzBuzString(45));
        assertEquals("FizzBuzz", fb.getFizzBuzString(15));
    }

    @Test
    void testFb04()
    {
        assertEquals("1", fb.getFizzBuzString(1));
        assertEquals("2", fb.getFizzBuzString(2));
        assertEquals("101", fb.getFizzBuzString(101));
    }
}
