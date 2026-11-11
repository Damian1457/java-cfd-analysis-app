package com.damian.cfdanalysisapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ApplicationTest {

    private static final String EXPECTED_APPLICATION_NAME = "Java CFD Analysis App";
    private static final String EXPECTED_STARTUP_OUTPUT = "Java CFD Analysis App" + System.lineSeparator()
            + "Application started successfully!" + System.lineSeparator();

    @Test
    void givenApplication_whenGetApplicationName_thenReturnApplicationName() {
        // Given
        Application app = new Application();

        // When
        String name = app.getApplicationName();

        // Then
        Assertions.assertEquals(EXPECTED_APPLICATION_NAME, name, "Expected application name was not returned.");
    }

    @Test
    void givenApplication_whenMain_thenPrintStartupMessage() {
        // Given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        String actualOutput;

        // When
        try {
            System.setOut(newOut);
            Application.main(new String[] {});
            actualOutput = outputStream.toString();
        } finally {
            System.setOut(originalOut);
        }

        // Then
        Assertions.assertEquals(
                EXPECTED_STARTUP_OUTPUT,
                actualOutput,
                "Application startup output was incorrect.");
    }
}
