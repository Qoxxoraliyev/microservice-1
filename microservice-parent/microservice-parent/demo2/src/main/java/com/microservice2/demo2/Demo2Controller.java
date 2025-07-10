package com.microservice2.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {



    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        String result="Mohirdev2";
        return ResponseEntity.ok(result);
    }


}
