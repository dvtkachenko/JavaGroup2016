import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by diman on 21.04.2017.
 */
public class testTemperatureConverter {

    TemperatureConverter  testObj;

    @Before
    public void init() {
        testObj = new TemperatureConverter();
    }

    @Test
    public void testTemperatureConverts() {

        assertEquals(5,testObj.convertFtoC(41), 0.1);
        assertEquals(6,testObj.convertFtoC(42), 0.1);

    }
}
