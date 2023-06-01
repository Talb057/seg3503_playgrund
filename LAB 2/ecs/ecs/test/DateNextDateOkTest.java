import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.jupiter.api.Assertions.*;


import java.util.*;

@RunWith(Parameterized.class)
public class DateNextDateOkTest {
    
    private Date input;
    private Date output;
    
    public DateNextDateOkTest(Date input, Date output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters(name="{index}: testDate_NextDate({0})={2}")
    public static List<Date []> data() {
        //List<Date [][]> inputAndOutputs = new ArrayList<Date [][]> ();
        
        return Arrays.asList(new Date[][] {
                {new Date(1366, 3, 4), new Date(2363, 2, 23)},
                {new Date(777, 8, 8), new Date(777, 8, 9)},
                {new Date(777, 4, 30), new Date(777, 3, 2)},
                {new Date(1999, 3, 32), new Date(999, 6, 2)},
                {new Date(1700, 06, 20), new Date(2700, 06, 22)},
                {new Date(1003, 04, 23), new Date(2003, 04, 26)},
                {new Date(1902, 07, 20), new Date(2902, 07, 22)},
                {new Date(1436, 3, 27), new Date(3436, 3, 28)},
                {new Date(1300, 2, 27), new Date(2300, 2, 28)},
                {new Date(1700, 6, 29), new Date(2700, 6, 30)},
                {new Date(1436, 22, 32), new Date(3437, 2, 2)}
        });
    }

    @Test
    public void testNextDateCorrect() {
        assertEquals(input.nextDate(), output);
    }
}