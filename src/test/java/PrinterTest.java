import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(40);
    }

    @Test
    public void hasPaper(){
        assertEquals(40, printer.getPaper());
    }

    @Test
    public void canPrintIfPaperAndTonerAvailable(){
        printer.print(5, 4);
        assertEquals(20, printer.getPaper());
        assertEquals(1480, printer.getToner());
    }

    @Test
    public void cantPrintIfPaperNotAvailable(){
        printer.print(10, 5);
        assertEquals(40, printer.getPaper());
        assertEquals(1500, printer.getToner());
    }

    @Test
    public void cantPrintIfTonerNotAvailable(){
        printer.print(1000, 2);
        assertEquals(40, printer.getPaper());
        assertEquals(1500, printer.getToner());
    }

    @Test
    public void canRefill(){
        printer.refillPaper();
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(1500, printer.getToner());
    }
}
