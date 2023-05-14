package com.example.test2.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //component in spring
@RequestMapping("/get") //URL
public class HelloController {

    @GetMapping(path = "/name")
    public String getName(){
    return "My name is Lamar";
    }

    @GetMapping(path = "/age")
    public String getAge(){
        return "My age is 22";
    }
    @GetMapping(path = "/check/status")
    public String getStatus(){
        return "Everything OK";
    }
    @GetMapping(path = "/health")
    public String getHealth(){
        return "Server health is up and running";
    }

}
