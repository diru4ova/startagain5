package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeColntroller {

    @RequestMapping (value = "/")
    public String home (){
        return "home";
    }

    @RequestMapping (value = "/welcome", method = RequestMethod.GET)
    public String getWelcome(){
        return "welcome";
    }
}
