package com.calendar.calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.calendar.model", "com.calendar.controller"})
@SpringBootApplication
public class CalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarApplication.class, args);
	}

}
