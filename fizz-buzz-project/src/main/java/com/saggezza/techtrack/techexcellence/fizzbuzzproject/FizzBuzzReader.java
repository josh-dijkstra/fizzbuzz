package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FizzBuzzReader implements IReader {

    private final ICMD commandLine;
    private final IValidator validator;

    public FizzBuzzReader(FizzBuzzCMD commandLine, FizzBuzzValidator validator) {
        this.commandLine = commandLine;
        this.validator =  validator;
    }

    @Override
    public int readValue() throws IOException, ExceptionBadInput, ExceptionOutOfBounds {
        String valueString = commandLine.readIO();
        int value = validator.parseInput(valueString);
        validator.errorHandler(value);
        return value;
    }
}
