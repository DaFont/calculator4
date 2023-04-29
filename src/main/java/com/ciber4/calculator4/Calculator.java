package com.ciber4.calculator4;

import org.springframework.stereotype.Service;

@Service
public class Calculator{
    int sum(int a, int b) {
        return a + b;
    }
}