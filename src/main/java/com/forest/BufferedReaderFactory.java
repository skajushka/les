package com.forest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderFactory {

    public static BufferedReader getInstance() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
