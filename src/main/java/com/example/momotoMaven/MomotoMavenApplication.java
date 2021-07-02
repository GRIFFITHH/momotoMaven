package com.example.momotoMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan //AppConfig가 필요없게 됨
@EnableAutoConfiguration
public class MomotoMavenApplication {


	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(MomotoMavenApplication.class, args)){
//			System.out.println("Enter 2 Numbers like 'a b' :");
//			ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
//			Argument argument = argumentResolver.resolve(System.in);
//			Calculator calculator = context.getBean(Calculator.class);
//			int result = calculator.calc(argument.getA(), argument.getB());
//			System.out.println("result = "+ result);
			Frontend frontend = context.getBean(Frontend.class);
			frontend.run();

		}
	}

}
