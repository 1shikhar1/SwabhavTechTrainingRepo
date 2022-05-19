package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.monocept.GoodByeService;
import com.swabhav.HowdyService;

@SpringBootApplication(scanBasePackages= {"com.monocept","com.swabhav"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(Application.class);
		
		GoodByeService sv1 = cxt.getBean(GoodByeService.class);
		System.out.println(sv1.getMessage());
		
		HowdyService sv3 = cxt.getBean(HowdyService.class);
		System.out.println(sv3.getMessage());
		
		System.out.println("End of the main");
	}

}
