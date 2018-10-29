package com.helen.sample1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class MyFirstSpringMVC {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String Hello() {
        return "Hello, SpringMVC.";
    }
}