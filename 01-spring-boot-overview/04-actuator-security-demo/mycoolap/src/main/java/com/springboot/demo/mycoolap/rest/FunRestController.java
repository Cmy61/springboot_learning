package com.springboot.demo.mycoolap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descriptions:
 * @author: cmy
 * @date: 2024/10/28 20:47
 * @version: 1.0
 */
@RestController
public class FunRestController {
    // expose "/" that return "hello world"
    @GetMapping("/")
    public String sayHello()
    {
        return "hello world";
    }
    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Run a hard 5k!!";
    }

    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune()
    {
        return "Today is your lucky day.";
    }
}
