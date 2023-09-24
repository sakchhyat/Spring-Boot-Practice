package com.sakchhyat.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){

        return "Practice fast bowling for fifteen minutes";
    }
}
