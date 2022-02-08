package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzzValidator implements IValidator {
    public void errorHandler(int input)  throws ExceptionOutOfBounds {
        if (input < 1 || input > 300) {
            throw new ExceptionOutOfBounds();
        }
        return;
    }
    public int parseInput(String input) throws ExceptionBadInput {
        try {
            int parseValue = Integer.parseInt(input);
            return parseValue;
        }catch(NumberFormatException e){
            throw new ExceptionBadInput();
        }
    }
}