package com.perficient.techbootcampjeffhanson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.perficient.techbootcampjeffhanson.entity"})
public class TechbootcampJeffhansonApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechbootcampJeffhansonApplication.class, args);
	}

}
