package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import java.io.IOException;

public class FizzBuzzMain {
    public static void main(String[] args) throws ExceptionBadInput, ExceptionOutOfBounds, IOException {
        IFlow fl = new FizzBuzzSpringFactory().getFizzBuzzFlow();
        fl.run();
    }
}
