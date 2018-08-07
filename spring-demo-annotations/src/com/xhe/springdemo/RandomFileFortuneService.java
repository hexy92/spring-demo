package com.xhe.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFileFortuneService implements FortuneService {

    @Value("${fortune1}")
    private String dailyFortune;


    @Override
    public String getFortune() {
        return dailyFortune;
    }
}
