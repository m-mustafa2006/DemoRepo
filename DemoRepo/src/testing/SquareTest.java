package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {
    @Test
    public void test() {
        JUnitTesting obj = new JUnitTesting();
        int output_obj = obj.square(5);
        assertEquals(25, output_obj);
    }
}
// This is Square Test v2
