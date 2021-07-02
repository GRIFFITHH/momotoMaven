package com.example.momotoMaven;

import calcset.Calculator;
import org.springframework.stereotype.Component;

@Component
public class addCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
