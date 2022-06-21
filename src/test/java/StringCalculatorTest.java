import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @BeforeEach
    public void setUp(){

    }

    @AfterEach
    public void tearDown(){

    }

    @Test
    public void testAddThrowsExceptionWithNegativeInput(){
        assertThrows(Exception.class, () -> StringCalculator.add("-1,5"));
    }

    @Test
    public void testAddNumbersBiggerThan1000AreIgnored(){
        int result = 0;
        try{
            result = stringCalculator.add("1,2000");
        }catch (Exception e){
            System.out.println(e);
        }
        assertEquals(1, result);
    }
}
