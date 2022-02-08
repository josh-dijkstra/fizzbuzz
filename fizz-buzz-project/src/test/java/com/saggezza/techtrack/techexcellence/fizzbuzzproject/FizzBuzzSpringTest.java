package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzSpringTest {

        @Test
        public void testGetFlow(){
            // Given I have a Fizz Buzz Factory
            IFlowFactory factory  = new FizzBuzzSpringFactory();
            // When I run getFizzBuzzFlow()
            IFlow flow = factory.getFizzBuzzFlow();
            assertThat(flow).isNotNull();
        }
}


