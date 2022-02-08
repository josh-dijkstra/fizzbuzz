package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

public interface IValidator {
    void errorHandler(int value) throws ExceptionOutOfBounds;
    int parseInput(String input) throws ExceptionBadInput;
}
