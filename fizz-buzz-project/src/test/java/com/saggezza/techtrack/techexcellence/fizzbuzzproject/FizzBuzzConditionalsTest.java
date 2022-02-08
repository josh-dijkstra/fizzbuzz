package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzConditionalsTest {
    @Test
    public void given1return1() {
        // Given the user enters 1
        int input = 1;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "1"
        assertThat(output).isEqualTo("1");
    }
    @Test
    public void given2return2() {
        // Given the user enters 2
        int input = 2;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "2"
        assertThat(output).isEqualTo("2");
    }
    @Test
    public void given3returnFizz() {
        // Given the user enters 3
        int input = 3;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "Fizz"
        assertThat(output).isEqualTo("Fizz");
    }
    @Test
    public void given5returnBuzz() {
        // Given the user enters 5
        int input = 5;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "Buzz"
        assertThat(output).isEqualTo("Buzz");
    }
    @Test
    public void given6returnFizz() {
        // Given the user enters 6
        int input = 6;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "Fizz"
        assertThat(output).isEqualTo("Fizz");
    }
    @Test
    public void given10returnBuzz() {
        // Given the user enters 10
        int input = 10;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "Buzz"
        assertThat(output).isEqualTo("Buzz");
    }
    @Test
    public void given15returnFizzBuzz() {
        // Given the user enters 15
        int input = 15;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "FizzBuzz"
        assertThat(output).isEqualTo("FizzBuzz");
    }
    @Test
    public void given30returnFizzBuzz() {
        // Given the user enters 30
        int input = 30;
        // When the user runs the fizz buzz condition
        IConditionals conds = new FizzBuzzConditionals();
        String output = conds.conditions(input);
        // Then return "FizzBuzz"
        assertThat(output).isEqualTo("FizzBuzz");
    }
}
