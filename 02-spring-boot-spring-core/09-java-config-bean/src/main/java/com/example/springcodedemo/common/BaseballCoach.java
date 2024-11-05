package com.example.springcodedemo.common;

import org.springframework.stereotype.Component;

/**
 * @descriptions:
 * @author: cmy
 * @date: 2024/11/4 17:29
 * @version: 1.0
 */
@Component
public class BaseballCoach implements Coach{
    public BaseballCoach()
    {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
