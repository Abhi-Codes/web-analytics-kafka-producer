package com.abhicodes.analyticskafkaproducer;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class TestcontainersConfig {

    @Bean
    public KafkaContainer kafkaProperties(DynamicPropertyRegistry registry) {
        KafkaContainer kafkaContainer = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.2.1"));
        registry.add("spring.kafka.bootstrap-servers", kafkaContainer::getBootstrapServers);
        return kafkaContainer;
    }
}