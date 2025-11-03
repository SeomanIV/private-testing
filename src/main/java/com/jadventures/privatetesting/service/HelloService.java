package com.jadventures.privatetesting.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements ApplicationRunner {

    @Value("${time.quantity}")
    private Integer timeQuantity;

    @Value("${time.unit}")
    private String timeUnit;

    public void printHello() {
        System.out.println("hello world");
    }

    private void calculateTime() {
        LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println("Current time: " + now);
        System.out.println("I will now calculate when will be "
            + "the current time plus " + timeQuantity + " " + timeUnit);
        LocalDateTime futureTime = now.plus(timeQuantity, ChronoUnit.valueOf(timeUnit.toUpperCase()));
        System.out.println("The future time is: " + futureTime);
    }

    @Override
    public void run(ApplicationArguments args) {
        printHello();
        calculateTime();
    }
}
