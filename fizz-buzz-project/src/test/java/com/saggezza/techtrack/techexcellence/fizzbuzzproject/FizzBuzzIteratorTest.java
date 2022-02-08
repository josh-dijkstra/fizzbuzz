package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzIteratorTest {

    private FizzBuzzIterator generator = null;
    private FizzBuzzConditionals conds = null;


    @BeforeEach
    public void setUp(){
        // Create Mock Classes
        conds = mock(FizzBuzzConditionals.class);
        when(conds.conditions(1)).thenReturn("valueA");
        when(conds.conditions(2)).thenReturn("valueB");
        when(conds.conditions(3)).thenReturn("valueC");

        generator = new FizzBuzzIterator(conds);
    }

    @Test
    public void test1() throws ExceptionOutOfBounds {
        // Given the user enters 1
        int input = 1;
        // When the user runs the fizz buzz generator
        String output = generator.generate(input);
        // Then return "valueA"
        assertThat(output).isEqualTo("valueA");
    }

    @Test
    public void test2() throws ExceptionOutOfBounds {
        //Given the user enters 2
        int input = 2;
        //When the user runs the fizz buzz generator
        String output = generator.generate(input);
        //Then return "valueA,valueB"
        assertThat(output).endsWith(",valueB");
    }

    @Test
    public void test3() throws ExceptionOutOfBounds {
        //Given the user enters 3
        int input = 3;
        //When the user runs the fizz buzz generator
        String output = generator.generate(input);
        //Then return "valueA,valueB,valueC"
        assertThat(output).endsWith(",valueC");
    }
}
