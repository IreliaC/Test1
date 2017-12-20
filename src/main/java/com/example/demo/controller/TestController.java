package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: chenby
 * Date: 2017-12-20
 */
@RestController
public class TestController {

    @RequestMapping("/ok")
    public String test() {
        return "ok";
    }
}
