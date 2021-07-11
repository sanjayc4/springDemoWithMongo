package com.sanjayTech.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

    @GetMapping(value = "/show")
    public String showValue(){
        return "Hello Sanjay!!";
    }
}
