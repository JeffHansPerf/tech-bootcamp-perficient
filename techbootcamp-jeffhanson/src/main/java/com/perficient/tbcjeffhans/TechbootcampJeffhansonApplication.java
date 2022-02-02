package com.perficient.tbcjeffhans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.perficient.tbcjeffhans.entity"})
public class TechbootcampJeffhansonApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechbootcampJeffhansonApplication.class, args);
	}

}
