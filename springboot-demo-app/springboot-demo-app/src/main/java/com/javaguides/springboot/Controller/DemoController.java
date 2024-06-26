package com.javaguides.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@ComponentScan(basePackages = {"com.Demo"})
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/WelcomeDemo")
    public String Welcome(String name)
    {
        return "Welcome "+ name + " to my Spring API"  ;
    }


}
