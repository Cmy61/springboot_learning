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
}
