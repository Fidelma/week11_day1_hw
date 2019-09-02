import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void Before(){
        printer = new Printer(20, 100);
    }

    @Test
    public void canGetNumberOfSheetsOfPaper(){
        assertEquals(20, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrint() {
        printer.print(2,5);
        assertEquals(10, printer.getSheetsOfPaper());
    }

    @Test
    public void cannotPrint() {
        printer.print(10,10);
        assertEquals(20, printer.getSheetsOfPaper());
    }

    @Test
    public void reducesToner() {
        printer.print(2, 5);
        assertEquals(90, printer.tonerVolume());
    }
}
