package com.real.time.springreal.timedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"controller", "service","config","service","stream"})
public class SpringRealTimeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRealTimeDemoApplication.class, args);
	}

}
