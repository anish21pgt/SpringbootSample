package com.sample.sampleproject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
@PostMapping("/data")
    public String CreateUser(@RequestBody String name){
        return "Hello" + name;
    }
}
