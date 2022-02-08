package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

public class FizzBuzzFlowFactory implements IFlowFactory{
    @Override
    public FizzBuzzFlow getFizzBuzzFlow() {
        FizzBuzzFlow fl = new FizzBuzzFlow(new FizzBuzzReader(new FizzBuzzCMD(), new FizzBuzzValidator()), new FizzBuzzIterator(new FizzBuzzConditionals()));
        return fl;
    }
}
