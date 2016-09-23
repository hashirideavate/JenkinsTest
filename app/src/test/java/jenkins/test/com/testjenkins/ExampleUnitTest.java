package jenkins.test.com.testjenkins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isInCorrect() throws Exception {
        assertNotEquals(4, 2 + 5);
    }

    @Test
    public void string_same() throws Exception {
        assertSame("Test", "Test");
    }

    @Test
    public void string_notSame() throws Exception {
        assertNotSame("Test", "test");
    }

}