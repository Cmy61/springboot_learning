package com.example.springcodedemo.rest;


import com.example.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descriptions:
 * @author: cmy
 * @date: 2024/11/2 15:58
 * @version: 1.0
 */
@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;

    //define a constrctor for dependency injection
    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theCoach)
    {
        myCoach=theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
