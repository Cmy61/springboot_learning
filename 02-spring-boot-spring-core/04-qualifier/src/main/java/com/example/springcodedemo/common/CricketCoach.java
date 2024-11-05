package com.example.springcodedemo.common;

import org.springframework.stereotype.Component;

/**
 * @descriptions:
 * @author: cmy
 * @date: 2024/11/2 15:54
 * @version: 1.0
 */

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 minutes:)";
    }
}
