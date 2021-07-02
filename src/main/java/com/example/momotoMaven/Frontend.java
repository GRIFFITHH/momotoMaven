package com.example.momotoMaven;

import calcset.Argument;
import calcset.ArgumentResolver;
import calcset.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Frontend {

    @Autowired // 오토와이어드로 필드에 주입하는 방법
    ArgumentResolver argumentResolver;
    @Autowired
    Calculator calculator;

    public void run(){
        System.out.println("Enter 2 numbers like 'a b' : ");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println(result);
    }
}
