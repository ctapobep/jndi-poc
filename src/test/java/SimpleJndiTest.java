import org.testng.annotations.Test;

import javax.naming.InitialContext;

/** @author stanislav bashkirtsev */
public class SimpleJndiTest {
    @Test
    public void testSimpleJndi() throws Exception {
        InitialContext context = new InitialContext();
        System.out.println(context.lookup("test.testobject"));
    }
}
