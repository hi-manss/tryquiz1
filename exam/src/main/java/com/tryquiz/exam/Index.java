package com.tryquiz.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Index {
    @RequestMapping("/")
        public String hello(){
    return "Index";
        }
        @RequestMapping("/about")
        public String about(){
        return "about";
        }

    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }
    @RequestMapping("/forgot-password")
    public String fgtpass(){
        return "LastPass";
    }

}

