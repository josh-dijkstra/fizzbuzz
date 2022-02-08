package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class FizzBuzzCMD implements  ICMD {
    public String readIO() throws IOException {
        // Enter data using BufferReader
        System.out.println("Input Value: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        return input;
    }
}
