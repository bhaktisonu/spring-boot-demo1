package com.javaguides.springboot.Controller;

import com.javaguides.springboot.Domain.Message1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping("/demo")
    public Message1 demo(@RequestParam(value = "name",defaultValue = "Welcome")String name)
    {
        return new Message1(String.format("demo %s",name));
    }
    @GetMapping("/hello")
    public Message1 startMessage(@RequestParam(value = "name",defaultValue = "Welcome")String name)
    {
        return new Message1(String.format("Hello  %s",name));
    }

    @GetMapping("/goodby")
    public Message1 goodbyMessage(@RequestParam(value = "name",defaultValue = "Welcome")String name)
    {
        return new Message1(String.format("See you next time %s",name));
    }
}
