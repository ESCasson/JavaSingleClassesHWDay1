import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer();
        printer.addsPaper(100);
        printer.addsToner(30);
    }

    @Test
    public void addsPaper(){

        assertEquals(100, printer.getPaper());
    }

    @Test
    public void checkPrintRuns(){
        printer.print(2,10);
        assertEquals(80, printer.getPaper() );
    }

    @Test
    public void checkPrintFailsduetoPaper(){
        printer.setPaper(10);
        assertEquals("Not enough Resources", printer.print(2,10) );
    }
    @Test
    public void checkPrintFailsduetoToner(){
        printer.setToner(10);
        assertEquals("Not enough Resources", printer.print(2,10) );
    }

    @Test
    public void checkTonerReduction(){
        printer.print(2,10);
        assertEquals(10, printer.getToner());
    }

    @Test
    public void checkTonerStaysTheSameWithNoPrint(){
        printer.setPaper(10);
        printer.print(2,10);
        assertEquals(30, printer.getToner());
    }


}
