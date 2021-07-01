package com.example.momotoMaven;

import AppConfig.AppConfig;
import calcset.Argument;
import calcset.ArgumentResolver;
import calcset.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

@SpringBootApplication
@Import(AppConfig.class)
@EnableAutoConfiguration
public class MomotoMavenApplication {


	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(MomotoMavenApplication.class, args)){
			System.out.println("Enter 2 Numbers like 'a b' :");
			ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
			Argument argument = argumentResolver.resolve(System.in);
			Calculator calculator = context.getBean(Calculator.class);
			int result = calculator.calc(argument.getA(), argument.getB());
			System.out.println("result = "+ result);

		}
	}

}
