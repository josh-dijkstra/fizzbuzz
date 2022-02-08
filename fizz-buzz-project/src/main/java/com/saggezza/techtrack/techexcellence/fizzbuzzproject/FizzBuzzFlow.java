package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class FizzBuzzFlow implements IFlow {

    private IReader inputReader;
    private IIterator generator;


    public FizzBuzzFlow(IReader inputReader, IIterator generator) {
        this.inputReader = inputReader;
        this.generator = generator;
    }

    @Override
    public void run() throws ExceptionOutOfBounds, IOException, ExceptionBadInput {
        int value = inputReader.readValue(); // Read Value from command line & Validate
        System.out.println(generator.generate(value)); // Generate String
    }


}
