package com.myfirstspringproject.firsttask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/health")
    public String MyFirstApi(){
        return "Running...";

    }


        
    
    
}
