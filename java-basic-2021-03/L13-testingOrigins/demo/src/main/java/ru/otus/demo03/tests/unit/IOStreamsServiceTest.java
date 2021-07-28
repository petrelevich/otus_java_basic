package ru.otus.demo03.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo03.app.service.IOStreamsService;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IOStreamsServiceTest {

    public void testInput(){
        String expected = "input string";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(expected.getBytes());
        IOStreamsService ioService = new IOStreamsService(null, inputStream);
        String actual = ioService.inputString();
        Assertions.assertEquals(expected, actual);
    }

    public void testOutput(){
        String expected = "output string";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOStreamsService ioService = new IOStreamsService(new PrintStream(outputStream), new ByteArrayInputStream(new byte[0]));
        ioService.outputString(expected);
        String actual = outputStream.toString();
        Assertions.assertEquals(expected + System.getProperty("line.separator"), actual);
    }

    public void testFormattedOutput(){
        String template = "%s%d";
        String expected = "Vladivostok2000";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOStreamsService ioService = new IOStreamsService(new PrintStream(outputStream), new ByteArrayInputStream(new byte[0]));
        ioService.outputString(template, "Vladivostok", 2000);
        String actual = outputStream.toString();
        Assertions.assertEquals(expected + System.getProperty("line.separator"), actual);
    }
}
