import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JunitTest {
    @Test
    public void junitTestPass() {
        int a = 1;
        int b = 2;
        assertTrue(a + b == 3);
    }

    @Test
    public void junitTestFail() {
        int a = 1;
        int b = 2;
        assertTrue(a + b == 2);
    }
}




