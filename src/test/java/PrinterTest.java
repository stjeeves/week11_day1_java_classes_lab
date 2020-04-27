import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30);
    }

    @Test
    public void checkTotalPaper(){
        assertEquals(30, printer.totalPaper());
    }

    @Test
    public void checkPrint(){
        assertEquals( 18, printer.print(2, 6));
    }
}
