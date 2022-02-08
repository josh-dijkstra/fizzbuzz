package com.saggezza.techtrack.techexcellence.fizzbuzzproject;

import java.io.IOException;

public interface IReader {
    int readValue() throws IOException, ExceptionBadInput, ExceptionOutOfBounds;
}
