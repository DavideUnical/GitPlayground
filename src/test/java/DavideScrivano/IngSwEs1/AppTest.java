package DavideScrivano.IngSwEs1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void getNumberTest() {
        assertEquals(3, App.getNumber());
        System.out.println( "Test completed" );
    }
}
