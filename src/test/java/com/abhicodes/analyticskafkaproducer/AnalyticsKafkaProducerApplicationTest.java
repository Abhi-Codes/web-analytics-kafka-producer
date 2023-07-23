package com.abhicodes.analyticskafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnalyticsKafkaProducerApplicationTest {

	public static void main(String[] args) {
		SpringApplication.from(AnalyticsKafkaProducerApplication::main).with(TestcontainersConfig.class)
				.run(args);
	}

}
