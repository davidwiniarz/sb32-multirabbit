//package com.example.demo;
//
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.boot.autoconfigure.amqp.MultiRabbitAutoConfiguration;
//import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//
//@ConditionalOnProperty(prefix = "spring", name = "multirabbitmq.enabled", havingValue = "true")
//@Import({MultiRabbitAutoConfiguration.class, RabbitAutoConfiguration.class})
//@Configuration
//@EnableRabbit
//public class RabbitMQConnector {
//}