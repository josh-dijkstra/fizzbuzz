package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzzConditionals implements IConditionals {
    public String conditions(int i) {
        if ((i % 3 == 0) && (i % 5 == 0)) { // If multiple of 3 and 5
            return "FizzBuzz";
        } else if (i % 5 == 0) { // If multiple of 5 only
            return "Buzz";
        } else if (i % 3 == 0) { // If multiply of 3 only
            return "Fizz";
        } else {
            return String.valueOf(i);
        }
    }
}
