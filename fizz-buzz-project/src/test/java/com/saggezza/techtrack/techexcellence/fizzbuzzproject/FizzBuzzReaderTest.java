package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class FizzBuzzReaderTest {

    private FizzBuzzCMD cmd = null;
    private FizzBuzzValidator validator = null;
    private FizzBuzzReader reader = null;


    @BeforeEach
    public void setUp() {
        // Create Mock Classes
        cmd = mock(FizzBuzzCMD.class);
        validator = mock(FizzBuzzValidator.class);
        reader = new FizzBuzzReader(cmd, validator);
    }

    @Test
    public void testReader() throws ExceptionOutOfBounds, ExceptionBadInput, IOException {
        reader.readValue();
        verify(cmd, times(1)).readIO();
        verify(validator, times(1)).parseInput(null);
        verify(validator, times(1)).errorHandler(anyInt());
    }
}
