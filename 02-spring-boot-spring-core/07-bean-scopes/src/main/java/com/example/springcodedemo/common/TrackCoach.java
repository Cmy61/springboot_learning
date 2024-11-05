package com.example.springcodedemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @descriptions:
 * @author: cmy
 * @date: 2024/11/4 17:31
 * @version: 1.0
 */
@Component
@Lazy
public class TrackCoach implements Coach{
    public TrackCoach()
    {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
