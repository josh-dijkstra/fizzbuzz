package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzBadInputErrorTest {

    @Test
    public void given_text_return_BadInputException() {
        //Given the user enters 301
        String input = "text";
        //When the user runs the fizz buzz error handler
        IValidator handler = new FizzBuzzValidator();
        Assertions.assertThrows(ExceptionBadInput.class, () -> {
            handler.parseInput(input);
        });
    }
    @Test
    public void given_number_return_clear() throws ExceptionBadInput {
        //Given the user enters 301
        String input = "1";
        //When the user runs the fizz buzz error handler
        IValidator handler = new FizzBuzzValidator();
        handler.parseInput(input);
    }
}
