package com.damian.cfdanalysisapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ApplicationTest {

private static final String EXPECTED_APPLICATION_NAME = "Java CFD Analysis App";

    @Test
    void givenApplication_whenGetApplicationName_thenReturnApplicationName() {
        // Given
        Application app = new Application();

        // When
        String name = app.getApplicationName();

        // Then
        Assertions.assertEquals(EXPECTED_APPLICATION_NAME, name, "Expected application name was not returned.");
    }

}