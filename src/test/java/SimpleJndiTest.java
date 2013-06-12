import org.testng.annotations.Test;

import javax.naming.InitialContext;

import static org.testng.Assert.assertEquals;

/** @author stanislav bashkirtsev */
public class SimpleJndiTest {
    @Test
    public void testSimpleJndi() throws Exception {
        InitialContext context = new InitialContext();
        assertEquals(context.lookup("test.testobject"), "hello!");
    }
}
