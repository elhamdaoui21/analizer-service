package com.ismail.analizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=DailyRecordController.class)
public class AnalizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalizerApplication.class, args);
	}
}
