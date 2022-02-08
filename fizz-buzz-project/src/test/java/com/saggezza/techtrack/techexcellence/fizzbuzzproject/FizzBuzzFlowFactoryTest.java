package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzFlowFactoryTest {

    @Test
    public void testGetFlow(){
        // Given I have a Fizz Buzz Factory
        IFlowFactory factory  = new FizzBuzzFlowFactory();
        // When I run getFizzBuzzFlow()
        IFlow flow = factory.getFizzBuzzFlow();
        assertThat(flow).isNotNull();
    }
}
