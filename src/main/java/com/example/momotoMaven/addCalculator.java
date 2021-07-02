package com.example.momotoMaven;

import org.springframework.stereotype.Component;

@Component
public class addCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
