package pl.mschielmann.infoshare.examples.currenda;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PrinterTest {

    @Test
    public void given_message_when_invoked_then_message_printed() {
        // given
        Printer printer = new Printer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String message = "Something's wrong here";

        // when
        printer.print(message);

        // then
        assertEquals(message, outContent.toString());
    }
}