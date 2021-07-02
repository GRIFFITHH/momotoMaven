package com.example.momotoMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan //AppConfig가 필요없게 됨
@EnableAutoConfiguration
public class MomotoMavenApplication implements CommandLineRunner {

	@Autowired
	ArgumentResolver argumentResolver;
	@Autowired
	Calculator calculator;

	@Override
	public void run(String... args) throws Exception { // Frontend class의 역할을 하는 메서드를 오버라이딩
		System.out.println("Enter 2 Numbers like 'a b' :");
			Argument argument = argumentResolver.resolve(System.in);
			int result = calculator.calc(argument.getA(), argument.getB());
			System.out.println("result = "+ result);
	}

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(MomotoMavenApplication.class, args)){

//			Frontend frontend = context.getBean(Frontend.class);
//			frontend.run();

		}
	}

}
