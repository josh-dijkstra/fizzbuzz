package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzIterator implements  IIterator{
    @Autowired
    private final IConditionals conds;

    public FizzBuzzIterator(IConditionals conds) {
        this.conds = conds;
    }

    public String generate(int input) {
        String output = ""; // Setup output string
        for (int i = 1; i < input + 1; i++) { // Loop over input value (1,300)
            String condOutput = conds.conditions(i); // Call Conditions
            if (i == 1){
                output += condOutput;
            }else{
                output += "," + condOutput;
            }
        }
        return output;
    }
}
