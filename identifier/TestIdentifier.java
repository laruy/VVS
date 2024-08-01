import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.Test;
public class TestIdentifier {

    /*
     * <"abc1234", FALSE>
     */

    static Identifier id; //objeto utilizado nos testes
    static String testData;

    @BeforeClass
    static public void setUpData()
    {
        id = new Identifier();
        testData = new String();
    }

    @Test
    public void test01()
    {
        testData = new String("aa");
        assertTrue(id.validateIdentifier(testData));

    }

    @Test
    public void test02()
    {
        testData = new String("$$223");
        assertFalse(id.validateIdentifier(testData));
    }

    @Test
    public void test03()
    {
        testData = new String("");
        assertFalse(id.validateIdentifier(testData));
    }

    @Test
    public void test04()
    {
        testData = new String("abc123");
        assertTrue(id.validateIdentifier(testData));
    }

    @Test
    public void test05()
    {
        testData = new String("12e");
        assertFalse(id.validateIdentifier(testData));
    }

    @Test
    public void test06()
    {
        testData = new String("a12a");
        assertTrue(id.validateIdentifier(testData));
    }

    @Test
    public void test07()
    {
        testData = new String("b");
        assertTrue(id.validateIdentifier(testData));
    }

    @Test
    public void test08()
    {
        testData = new String("abc1234");
        assertFalse(id.validateIdentifier(testData));
    }


}
