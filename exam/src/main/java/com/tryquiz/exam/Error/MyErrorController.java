package com.tryquiz.exam.Error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyErrorController {
    @GetMapping("/error")
    public String errr(){
        return "error";
    }



}