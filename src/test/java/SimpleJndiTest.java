import org.testng.annotations.Test;

import javax.naming.InitialContext;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/** @author stanislav bashkirtsev */
public class SimpleJndiTest {
    @Test
    public void testSimpleJndi() throws Exception {
        InitialContext context = new InitialContext();
        assertEquals(context.lookup("test.testobject"), "hello!");
    }

    @Test
    public void testSimpleJndiDoesNotFollowSpecsAndReturnsNullInsteadOfThrowing() throws Exception {
        InitialContext context = new InitialContext();
        assertNull(context.lookup("test.does_not_exist"));
    }
}
