package com.example.kartiksapra.cool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PehlaSpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PehlaSpringProjectApplication.class, args);
		Car car1 = context.getBean(Car.class);
		System.out.println(car1.getEngine().getEngine());
		

		Car car2 = context.getBean(Car.class);
		System.out.println(car2);
		
		
//		Car car1 = new Car();
//		Engine engine1 = new Engine()
//		car1.setEngine(engine1);
		
	}

}
