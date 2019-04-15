package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableHystrixDashboard
@ComponentScan(basePackages = "com.example.demo")
public class HystrixDashboardStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardStartApplication.class, args);
	}
	

}
