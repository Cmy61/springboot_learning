package com.example.springcodedemo.common;

import org.springframework.stereotype.Component;

/**
 * @descriptions:
 * @author: cmy
 * @date: 2024/11/4 17:30
 * @version: 1.0
 */
@Component
public class TennisCoach implements Coach{
    public TennisCoach()
    {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}