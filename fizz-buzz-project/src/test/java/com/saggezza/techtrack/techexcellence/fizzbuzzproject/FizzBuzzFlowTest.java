package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

public class FizzBuzzFlowTest {

    private IIterator generator = null;
    private IReader reader = null;
    private IFlow flow = null;


    @BeforeEach
    public void setUp() {
        // Create Mock Classes
        reader = mock(FizzBuzzReader.class);
        generator = mock(FizzBuzzIterator.class);

        flow = new FizzBuzzFlow(reader, generator);
    }

    @Test
    public void testFlow() throws ExceptionOutOfBounds, ExceptionBadInput, IOException {
        flow.run();
        verify(reader, times(1)).readValue();
        verify(generator, times(1)).generate(anyInt());
    }

    @Test
    public void testBadInput() throws ExceptionBadInput, ExceptionOutOfBounds, IOException {
        when(reader.readValue()).thenThrow(new ExceptionBadInput());
        ThrowableAssert.ThrowingCallable callable = () -> flow.run();
        assertThatThrownBy(callable).isInstanceOf(ExceptionBadInput.class);
        verify(reader, times(1)).readValue();
        verify(generator, times(0)).generate(anyInt());
    }
}
