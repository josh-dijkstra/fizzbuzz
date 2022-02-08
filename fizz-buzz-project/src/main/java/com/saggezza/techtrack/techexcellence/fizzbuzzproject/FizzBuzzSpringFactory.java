package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.saggezza.techtrack.techexcellence.fizzbuzzproject")
public class FizzBuzzSpringFactory implements IFlowFactory{
    @Override
    public FizzBuzzFlow getFizzBuzzFlow() {
        ApplicationContext context = new AnnotationConfigApplicationContext(this.getClass());
        return context.getBean((FizzBuzzFlow.class));
    }
}
