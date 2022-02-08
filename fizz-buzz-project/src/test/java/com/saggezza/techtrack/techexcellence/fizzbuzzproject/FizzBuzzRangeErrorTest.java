package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzRangeErrorTest {
    @Test
    public void given_301_return_OutOfBounds() {
        //Given the user enters 301
        int input = 301;
        //When the user runs the fizz buzz error handler
        FizzBuzzValidator handler = new FizzBuzzValidator();
        Assertions.assertThrows(ExceptionOutOfBounds.class, () -> {
            handler.errorHandler(input);
        });
    }

    @Test
    public void given_minus_1_return_OutOfBounds() {
        //Given the user enters -1
        int input = -1;
        //When the user runs the fizz buzz error handler
        FizzBuzzValidator handler = new FizzBuzzValidator();
        Assertions.assertThrows(ExceptionOutOfBounds.class, () -> {
            handler.errorHandler(input);

        });
    }
    @Test
    public void given_1_return_clear() throws ExceptionOutOfBounds {
        //Given the user enters 1
        int input = 1;
        //When the user runs the fizz buzz error handler
        FizzBuzzValidator handler = new FizzBuzzValidator();
        handler.errorHandler(input);
    }
    @Test
    public void given_300_return_clear() throws ExceptionOutOfBounds {
        //Given the user enters 301
        int input = 300;
        //When the user runs the fizz buzz error handler
        FizzBuzzValidator handler = new FizzBuzzValidator();
        handler.errorHandler(input);
    }
}
