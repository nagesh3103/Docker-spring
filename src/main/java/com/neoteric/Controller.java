package com.neoteric;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/jenkins")
    public String jenkins(){
        return "jenkins";
    }
}
