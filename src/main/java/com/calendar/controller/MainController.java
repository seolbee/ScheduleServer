package com.calendar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String main(){
        return "hello";
    }
}
